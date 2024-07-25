package org.sample.inherit;

public class BlockTest {
	// ��̬������������ļ��ض�׼�������������ڹ����ִ��static block will execute before constructor and only execute once
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