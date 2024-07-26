package org.sample.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class PersonMethodTest {

    public static void main(String[] args) throws Exception {

        Person p1 = new Person("zhangfei", 30);
        System.out.println("method get name value is " + p1.getName()); // zhangfei

        System.out.println("------------------------------------------------------");
        //use reflection to get class and call method
        Class c1 = Class.forName("org.sample.reflection.Person");

        Constructor constructor = c1.getConstructor(String.class, int.class);

        Object object = constructor.newInstance("zhangfei", 30);

        Method method = c1.getMethod("getName");

        System.out.println("method get name value is " + method.invoke(object)); // zhangfei

        System.out.println("------------------------------------------------------");

        Method[] methods = c1.getMethods();
        for (Method mt : methods) {
            System.out.println("method modifier is " + mt.getModifiers());
            System.out.println("method return type is " + mt.getReturnType());
            System.out.println("method name is " + mt.getName());
            System.out.println("method parameters type are ");
            Class<?>[] parameterTypes = mt.getParameterTypes();
            for (Class ct : parameterTypes) {
                System.out.print(ct + " ");
            }

            System.out.println();
            System.out.println("---------------------------------------------------");
        }
    }
}
