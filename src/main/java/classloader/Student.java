package classloader;

/**
 * @author LiuYong on 2017/3/13 0013 9:47.
 */
public class Student {


    public void printPersonLoader(){
        Teacher t = new Teacher();
        System.out.println("Teacher classloader:"+t.getClass().getClassLoader());
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    private String studentName;

}
