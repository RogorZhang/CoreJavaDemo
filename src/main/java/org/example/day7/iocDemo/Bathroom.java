package org.example.day7.iocDemo;

public class Bathroom {
    Integer size;
    boolean withTank;

    public Bathroom(Integer size, boolean withTank) {
        this.size = size;
        this.withTank = withTank;
    }

    @Override
    public String toString() {
        return "Bathroom{" +
                "size=" + size +
                ", withTank=" + withTank +
                '}';
    }


}
