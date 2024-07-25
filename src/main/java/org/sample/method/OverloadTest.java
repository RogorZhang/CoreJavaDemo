package org.sample.method;

public class OverloadTest {

	void show() {
		System.out.println("show()");
	}
	void show(int i) { // ok  �����ڷ��������ĸ�����ͬ
		System.out.println("show(int)");
	}
	void show(int i, double d) { // ok  �����ڷ��������ĸ�����ͬ
		System.out.println("show(int, double)");
	}
	void show(int i, int j) { // ok  �����ڷ������������Ͳ�ͬ
		System.out.println("show(int, int)");
	}
	void show(double d, int i) { // ok  �����ڷ���������˳��ͬ
		System.out.println("show(double, int)");
	}
	public static void main(String[] args) {

		OverloadTest ot = new OverloadTest();
		ot.show();
		ot.show(66);
		ot.show(66, 3.14);
		ot.show(66, 118);
		ot.show(3.14, 118);
	}
}