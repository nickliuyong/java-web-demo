package entry;

import classloader.AClassLoader;

import java.lang.reflect.Method;

/**
 * 类加载器测试
 *
 * APPCLASSLOADER类加载器执行顺序  (parentLoader == null ? null(bootstrapLoader 加载器) : parentLoader)  >>  (APPCLASSLOADER)
 *
 * JVM规定被引用类默认由依赖类的ClassLoader加载
 *
 * @author LiuYong on 2017/3/10 0010 18:03.
 */
public class ClassLoaderTest {

    public static void main(String[] args) throws Exception {
        AClassLoader loader = new AClassLoader();
        Class c = loader.loadClass("classloader.Student", false);
        Object o =  c.newInstance();
        Method method = o.getClass().getMethod("printPersonLoader");
        method.invoke(o);
        System.out.println("Student classloader:"+o.getClass().getClassLoader());
        System.out.println("parent classloader:"+o.getClass().getClassLoader().getParent());
    }
}