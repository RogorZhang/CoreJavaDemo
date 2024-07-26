package org.sample.reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

public class StudentTest {

    public static void main(String[] args) throws Exception {

        Class c1 = Class.forName("org.sample.reflection.Student");
        System.out.println("package info " + c1.getPackage());
        System.out.println("parent info " + c1.getSuperclass());

        System.out.println("-------------------------------------------------");
        System.out.println("interface info ");
        Class[] interfaces = c1.getInterfaces();
        for (Class ct : interfaces) {
            System.out.print(ct + " ");
        }
        System.out.println();

        System.out.println("-------------------------------------------------");
        System.out.println("annotation info ");
        Annotation[] annotations = c1.getAnnotations();
        for (Annotation at : annotations) {
            System.out.print(at + " ");
        }
        System.out.println();

        System.out.println("-------------------------------------------------");
        System.out.println("generic info ");
        Type[] genericInterfaces = c1.getGenericInterfaces();
        for (Type tt : genericInterfaces) {
            System.out.print(tt + " ");
        }
        System.out.println();
    }
}
