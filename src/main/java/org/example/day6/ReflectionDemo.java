package org.example.day6;

import com.sun.jna.MethodParameterContext;

import java.beans.BeanProperty;
import java.lang.annotation.*;
import java.lang.reflect.*;
import java.util.Arrays;
import java.util.Objects;

public class ReflectionDemo {
    public static void main(String[] args) throws Exception{
        RunningTestInstance obj = new RunningTestInstance();
        Class cls = obj.getClass();

//        System.out.println("the name of the class is " + cls.getName());
//        Constructor constructor = cls.getConstructor();
//        System.out.println("the constructor is " + constructor.getName());
//
//        Method[] methods = cls.getMethods();
//        for (Method method: methods) {
//            System.out.println(method);
//        }
//        System.out.println("---------------------------------");
//        Method[] methods2 = cls.getDeclaredMethods();
//        for (Method method: methods2) {
//            System.out.println(method);
//        }

//        obj.method2(2);
//
//        Method reflectMethod2 = cls.getDeclaredMethod("method2", int.class);
//        reflectMethod2.invoke(obj, 19);

//        Method reflectMethod3 = cls.getDeclaredMethod("method3");
//        reflectMethod3.setAccessible(true);
//        reflectMethod3.invoke(obj);

        Class testClass = RunningTestInstance.class;
//        Method reflectMethod4 = testClass.getDeclaredMethod("method4");
//        Annotation[] annotations = reflectMethod4.getDeclaredAnnotations();
//        for (Annotation annotation: annotations) {
//            System.out.println(annotation.annotationType());
//        }

        Annotation[] annotations = testClass.getAnnotations();
        for (Annotation annotation: annotations) {
            System.out.println(annotation.annotationType());
            MyAnnotation myAnnotation = (MyAnnotation) annotation;
            System.out.println(myAnnotation.name());
            System.out.println(myAnnotation.value());
        }




    }

    public void writeLogMethod() {

    }
}


@MyAnnotation(name="bob", value = "123")
class RunningTestInstance {
    private String val;

    public RunningTestInstance() {
        this.val = "12345";
    }

    public void method1() {
        System.out.println("the value is " + val );
    }


    public void method2 (int n){
        System.out.println("the number is " + n);
    }

    private void method3() {
        System.out.println("private method");
    }


    public void method4 () {
        System.out.println("method with annotation");

    }
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface MyAnnotation {
    public String name();
    public String value();
}


