package org.sample.inherit;

public class PeopleTest {
	
	public static void main(String[] args) {
		System.out.println("Country info " + People.getCountry()); // null
		
		// 1.使用有参方式构造两个People类型的对象并打印特征
		People p1 = new People("zhangfei", 30/*, "China"*/);
		p1.show(); // zhangfei 30 China
		
		People p2 = new People("guanyu", 35/*, "China"*/);
		p2.show(); // guanyu 35 China

		System.out.println("--------------------------------------------");
		// 2. static member will share between objects
		p1.setCountry("China");
		System.out.println("p1 country is " + p1.getCountry()); // China
		System.out.println("p2 country is " + p2.getCountry()); // China
		
		People p3 = new People();
		System.out.println("p3 country is " + p3.getCountry()); // China
	}
}