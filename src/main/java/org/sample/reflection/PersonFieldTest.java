package org.sample.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class PersonFieldTest {

    public static void main(String[] args) throws Exception {

        Person p1 = new Person("zhangfei", 30);
        System.out.println(p1.name); // zhangfei

        System.out.println("-------------------------------------------------------");
        // 2.use reflection
        // 2.1 Get class obj
        Class c1 = Class.forName("org.sample.reflection.Person");
        // 2.2 get constructor
        Constructor constructor = c1.getConstructor(String.class, int.class);
        // 2.3 get person object use parameter constructor
        Object object = constructor.newInstance("zhangfei", 30);
        // 2.4 get member variable field
        Field field = c1.getDeclaredField("name");
        field.setAccessible(true);

        //get field value
        System.out.println("name is " + field.get(object)); // zhangfei

        System.out.println("-------------------------------------------------------");
        // 3.使用原始方式修改指定对象中成员变量的数值后再次打印
        //p1.name = "guanyu";
        //System.out.println("修改后成员变量的数值为：" + p1.name); // guanyu

        System.out.println("-------------------------------------------------------");
        // 4.modify field name use refection

        field.set(object, "guanyu");
        System.out.println("Modified value is " + field.get(object)); // guanyu

        System.out.println("-------------------------------------------------------");
        // 5.get all members by use reflection
        Field[] declaredFields = c1.getDeclaredFields();
        for (Field ft : declaredFields) {
            System.out.println("Modifier is " + ft.getModifiers());
            System.out.println("Data type is " + ft.getType());
            System.out.println("member name is " + ft.getName());
            System.out.println("---------------------------------------------");
        }
    }
}
