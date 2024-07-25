package org.sample.inherit;

public class DogTest {

    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.show(); // null null 0

        Dog d2 = new Dog("test", "white", 10);
        d2.show(); // test white  10
    }
}
