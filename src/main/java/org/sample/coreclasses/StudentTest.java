package org.sample.coreclasses;

public class StudentTest {

    public static void main(String[] args) {

        // 1.使用有参方式构造Student类型的两个对象并判断是否相等
        Student s1 = new Student(1001, "zhangfei");
        //Student s2 = new Student(1002, "guanyu");
        Student s2 = new Student(1001, "zhangfei");
        System.out.println(s1.equals(s2)); //rue
        System.out.println(s1 == s2); //false

        System.out.println("----------------------------------------------------------");
        int ia = s1.hashCode();
        int ib = s2.hashCode();
        System.out.println("ia = " + ia);
        System.out.println("ib = " + ib);

        System.out.println("----------------------------------------------------------");
        System.out.println(s1); //call to string
    }
}
