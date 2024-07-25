package org.sample.inherit;

public class Dog extends Animal {
    private int tooth;

    public Dog() {
        super(); // call parent non param constructor
    }

    public Dog(String name, String color, int tooth) {
        super(name, color); // call parent constructor with params
        setTooth(tooth);
    }

    public int getTooth() {
        return tooth;
    }
    public void setTooth(int tooth) {
        if (tooth > 0) {
            this.tooth = tooth;
        } else {
            System.out.println("Not a valid tooth number!");
        }
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Tooth value is " + getTooth());
    }
}
