package org.sample.collections2;

public class SubPersonTest {

    public static void main(String[] args) {

        SubPerson sp1 = new SubPerson();
        sp1.setGender("Female");

        System.out.println("----------------------------------------");
        SubPerson<Boolean, String> sp2 = new SubPerson<>();
        sp2.setGender(true);
    }
}
