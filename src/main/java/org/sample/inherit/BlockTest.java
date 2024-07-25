package org.sample.inherit;

public class BlockTest {
	// 静态代码块会随着类的加载而准备就绪，会先于构造块执行static block will execute before constructor and only execute once
	static {
		System.out.println("#####################static block!");   // (1)
	}

	public BlockTest() {
		System.out.println("constructor"); // (3)
	}
	
	public static void main(String[] args) {
		
		BlockTest bt = new BlockTest();
		
		
		BlockTest bt2 = new BlockTest();
	}
}