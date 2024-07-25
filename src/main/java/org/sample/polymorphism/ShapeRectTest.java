package org.sample.polymorphism;

public class ShapeRectTest {

    public static void main(String[] args) {

        Shape s1 = new Shape(1, 2);
        s1.show(); // 1 2

        System.out.println("------------------------------------");
        Rect r1 = new Rect(3, 4, 5, 6);
        r1.show(); // 3 4 5 6

        System.out.println("------------------------------------");
        Shape sr = new Rect(7, 8, 9, 10);
        sr.show(); // 7 8 9 10

        System.out.println("------------------------------------");
        //call static method
        Shape.test();

        System.out.println("------------------------------------");
        int ib = ((Rect) sr).getLen();
        System.out.println("Length is " + ib); // 9

        //cast shape to circle
        if(sr instanceof Circle) {
            System.out.println("Circle");
        } else {
            System.out.println("Can't cast!");
        }
    }
}
