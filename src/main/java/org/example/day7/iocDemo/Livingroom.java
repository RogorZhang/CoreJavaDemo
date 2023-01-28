package org.example.day7.iocDemo;

public class Livingroom {
    Integer size;
    String type;

    public Livingroom(Integer size, String type) {
        this.size = size;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Livingroom{" +
                "size=" + size +
                ", type='" + type + '\'' +
                '}';
    }
}
