package classloader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;

/**
 * @author LiuYong on 2017/3/13 0013 9:37.
 */
public class AClassLoader extends ClassLoader {

    @Override
    public Class<?> loadClass(String name, boolean resolve) throws ClassNotFoundException {
        Class klass;
        try {
            klass = findLoadedClass(name); //检查该类是否已经被装载。
            if (klass != null) {
                return klass;
            }
            if (klass == null) { //如果读取字节失败，则试图从JDK的系统API中寻找该类。
                klass = findSystemClass(name);
            }
            if (resolve && klass != null) {
                resolveClass(klass);
            }
            byte[] bs = getClassBytes(name);//从一个特定的信息源寻找并读取该类的字节。
            if (bs != null && bs.length > 0) {
                klass = defineClass(name, bs, 0, bs.length);
            }
        } catch (IOException e) {
            throw new ClassNotFoundException(e.toString());
        }
//        System.out.println("klass == " + klass);
        return klass;
    }

    private byte[] getClassBytes(String className) throws IOException {
        URL path = this.getClass().getClassLoader().getResource("");
        String filePath = path.getPath();
        filePath += className.replace('.', File.separatorChar) + ".class";
        FileInputStream fis;
        try {
            fis = new FileInputStream(filePath);
        } catch (FileNotFoundException e) {
            //此classpath不能加载JDK API
            return null;   //如果查找失败，则放弃查找。捕捉这个异常主要是为了过滤JDK的系统API。
        }
        byte[] bs = new byte[fis.available()];
        fis.read(bs);
        return bs;
    }
}
