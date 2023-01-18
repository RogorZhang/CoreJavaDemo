package org.example.day3;

import org.example.exception.UserNotFoundException;

import java.io.*;
import java.sql.SQLException;
import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class Day3Note {



    /*

    1. Exception
        Checked Exception: compile/
            handle
                try catch
                throws
            ClassNoteFoundException, IOException, SQLException,FileNotFoundException

        uncheck Exception: runtime
            ArithmeticException, ArrayIndexOutOfBoundsException, ClassCastException, NPE

                public static void main(String[] args)  {

                    try {
                        fileReader("/");
                    } catch (FileNotFoundException e) {
                        throw new RuntimeException(e);
                    }
                }

                public static void fileReader(String path) throws FileNotFoundException{
                }

        throw vs throws
           public static String main(String str) {
                if (str == null || str.length() == 0) {
                   throw new Error();
                }
                return null;
           }


        Customized Exception
            public class UserNotFoundException extends RuntimeException{
                public UserNotFoundException() {
                    super();
                }

                public UserNotFoundException(String msg) {
                    super(msg + "this is a customized exception");
                }
            }
        finally

        multiple catch

            try {
                FileInputStream input = new FileInputStream("/");
            } catch(UserNotFoundException | NullPointerException | ArithmeticException | FileNotFoundException ex) {
                System.out.println(ex);
            }
       try with resources
               AutoCloseable, close()

            try (
                    BufferedReader br = new BufferedReader(new FileReader("/"))
            )
            {
                br.readLine();
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

    2. Genertics

            class Node <K, V> {
                K key;
                V value;

                public Node(K key, V value) {
                    this.key = key;
                    this.value = value;
                }
            }

            public static <E> E getFirstElement(E[] array) {
                return array[0];
            }

3, Java 8 new features
    lambda expression
            (argments) -> {body}

            Workout wk = () -> {
                System.out.println("I will do deadlift today");
            };
            wk.deadlift();

            Set<Integer> tr = new TreeSet<>((a, b) -> b - a);

    Functional Interface
        only one abstract method
        default concrete method
        @FunctionalInterface // optional

        @FunctionalInterface // optional
        interface Drawable {
            public void draw();

            public default void drawCircle() {
                System.out.println("drawing a circle");
            }

            public default void drawLine() {
                System.out.println("drawing a line");
            }

        }

        predefined functional interface
            Predicate
                public Boolean test(T t);
            Function
               public R apply(T t);
            Consumer
                public void accept(T t);
            Supplier
                public R get();
            BiPredicate
                public boolean test(T t, U u);
            BiFunction<R, T, U>
                public R apply(T t, U u);

            BiFunction<Integer, Integer, Integer> myAdd = (a, b) -> a + b;
            System.out.println(myAdd.apply(1, 2));

            Function<Integer, Integer> addOne = a -> a + 1;
            System.out.println(addOne.apply(4));

    Optional
        NPE

        String[] array = new String[2];
        String[] array = new String[]{"abc", "tyu"};
        if (array[0] == null) {

            throw new IllegalArgumentException("the value is null");
        } else {
            System.out.println(array[0]);
        }

        Optional opt = Optional.ofNullable(array[0]);
        System.out.println(opt.orElse("the value is null"));
        opt.orElseThrow(() -> new IllegalArgumentException("the value is null"));

        empty(), of(), ofNullable(), isPresent(), isEmpty(), orElse(), orElseThrow()


     */
    public static void main(String[] args) throws Throwable {




    }



}












