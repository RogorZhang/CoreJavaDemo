package org.sample.method;

public class StudentTest {
	
	public static void main(String[] args) {

		Student s1 = new Student();
		//s1.setId(-1001);
		s1.setId(1001);
		s1.setName("test");
		s1.show(); // 1001 �ŷ�
		
		System.out.println("----------------------------------------------------");
		// 3.ʹ���вη�ʽ������󲢴�ӡ����
		Student s2 = new Student(1001, "");
		s2.show(); 
	}
}