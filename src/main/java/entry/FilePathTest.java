package entry;

import java.io.File;

/**
 * <p>
 *     文件路径测试，new File()获取绝对路径是以执行所在路径所决定的
 * </p>
 * @author LiuYong on 2017/3/10 0010 10:20.
 */
public class FilePathTest {

    public static void main(String[] args) throws Exception{
        File file = new File("tt.txt");
        if(!file.exists()){
            file.createNewFile();
        }
        System.out.println(file.getAbsolutePath());

        System.out.println(FilePathTest.class.getClassLoader().getResource(""));
    }
}
