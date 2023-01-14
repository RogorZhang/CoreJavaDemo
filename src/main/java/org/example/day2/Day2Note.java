package org.example.day2;
import java.util.*;

public class Day2Note {
/*
1. Java, compile ocnce, run anywhere
    .java file  -> .class file (byteCode) -> machine code
2. JVM Architecture
    CLass loader
        Bootstrap class Loader,   Extension class loader,       application class loader
        java.lang.*;              $JAVA_HOME/jre/lib/ext,    load files present on the classPath
        java.util.*;

        parents delegation model
        app -> ext -> boot
            <-      <-

     Runtime data area
        Method area: all class level data, run-time constant pool, field, and method data, ...
        Heap area: when using new keyword to create object, this object will be in heap area
        Stack area: stack frame, (call stack)
        PC Register:
          multiple threads, pc register -> jvm instruction
        Native method stack: method written in other language

     Execution Engine
        Interpreter: line by line, for
        JIT compiler: hotspot
        GC
            phrases: mark, sweep, (compact)
            types:
                serial GC,       one thread, -> "stop the world"
                parallel GC,     multiple threads
                G1GC, (big memory space ( >= 4GB))chunks
                    eden region, survivor region, tenured region, humongous region, available region
                CMS: deprecated at java 9, removed at java 14 in favor of G1GC
        JNI (native method interface): bridge

3. reserved words (53)
    reserved literals (3)
        true/false/null
    keywords(50)
        unused keywords (2)
            goto/ const
        used keywords (48)

    reserved words for data types: byte, short, int, long, float, double, char, boolean
    flow control: if, else, switch, case, default, for, do, while, break, continue, return
    modifiers: public, private, protected, static, final, abstract, synchronized, native, strictfp, transient, volatile
    exception handling: try, catch, finally, throw, throws, assert
    class: class, package, import, extends, implements, interface
    object: new, instanceof, super, this

    final
        final variable: can't modify it, initialize
          final int a = 1;
          int b = 1;
//        a = b; // error
        System.out.println(a);

        final method: can't override
            class A {
                final public void method() {
                    System.out.println("in method A");
                }
            }

            class B extends A {
            //    @Override
            //    public void method() {
            //        System.out.println("in method B");
            //    }
            }
       final class: can't extend
            final class A {
            }

            // compile error
            class B extends A {

            }
       how to create immutable class
        - final class
        - private field
        - no setter, only getter
        - deep copy of collection

            final class MyImmutableClass {

                private final int id;
                private final List<Integer> list;

                MyImmutableClass(int id, List<Integer> list) {
                    this.id = id;
                    this.list = deepCopy(list);
                }

                public int getId() {
                    return id;
                }

                public List<Integer> getList() {
                    List<Integer> newList = deepCopy(this.list);
                    return newList;
                }

                private List<Integer> deepCopy(List<Integer> list) {
                    List<Integer> newList = new ArrayList<>();
                    for (Integer num: list) newList.add(num);
                    return newList;
                }
            }
        final, finally, finalize

        static
            blocks/ variable/ method/ classes



                static int a = 10;
                static int instance;
                static {
                    System.out.println("static block");
                    instance = 10;
                }

                public static void method2() {
                    System.out.println("method 2");
                }


                public static void main(String[] args) {
                    Day2Note.method2();
                    method2();
            //        method3();
                    Day2Note obj = new Day2Note();
                    obj.method3();
                }

                public void method3() {
                     method2();

                }
            }

            class A {
                public void method() {
                    System.out.println(Day2Note.instance);
                    Day2Note.method2();
                }
            }

       static class: Map.Entry<Integer, Integer>

       implements and extends

4, OOP
    abstraction, encapsulation, inheritance, polymorphism
    abstraction
        abstract class, interface
    encapsulation
        declare variable as private, setter and getter
    inheritance
        extends, implements
    polymorphism
        overload, compile time polymorphism
        override, runtime polymorphism


            public static void main(String[] args) {
            //        A obj = new C();       // in class B
            //        B obj = new C();       // in class B
            //        A obj = new A();       // in class A
            //        C obj = new A();       // compile error

                    A obj = new C();         //
                    obj.method();  // == A.method(); // in class A
                }

            }

            class A {
                public static void method() {
                    System.out.println("in class A");
                }

            }

            class B extends A {

            //    @Override
                public static void method() {
                    System.out.println("in class B");
                }
            }

            class C extends B {
            }
            

 */


    public static void main(String[] args) {

    }

}





