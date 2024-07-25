package org.sample.method;

public class StudentTest {
	
	public static void main(String[] args) {

		Student s1 = new Student();
		//s1.setId(-1001);
		s1.setId(1001);
		s1.setName("test");
		s1.show(); // 1001 张飞
		
		System.out.println("----------------------------------------------------");
		// 3.使用有参方式构造对象并打印特征
		Student s2 = new Student(1001, "");
		s2.show(); 
	}
}