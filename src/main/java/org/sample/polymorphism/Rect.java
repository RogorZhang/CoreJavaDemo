package org.sample.polymorphism;

public class Rect extends Shape {
    private int len;
    private int wid;

    public Rect() {
    }

    public Rect(int x, int y, int len, int wid) {
        super(x, y);
        setLen(len);
        setWid(wid);
    }

    public int getLen() {
        return len;
    }

    public void setLen(int len) {
        if(len > 0) {
            this.len = len;
        } else {
            System.out.println("Not a valid length!");
        }
    }

    public int getWid() {
        return wid;
    }

    public void setWid(int wid) {
        if (wid > 0) {
            this.wid = wid;
        } else {
            System.out.println("Not a valid width!");
        }
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Length is " + getLen() + ", width is " + getWid());
    }

}
