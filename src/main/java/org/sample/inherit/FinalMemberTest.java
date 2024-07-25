package org.sample.inherit;

public class FinalMemberTest {
    private final int cnt = 3;

    public static void main(String[] args) {
        FinalMemberTest fmt = new FinalMemberTest();
        System.out.println("fmt.cnt = " + fmt.cnt); // 3
    }
}
