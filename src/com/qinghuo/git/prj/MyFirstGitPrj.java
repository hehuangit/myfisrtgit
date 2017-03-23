package com.qinghuo.git.prj;
/**
 * 
 * @author hehuan
 *
 */
public class MyFirstGitPrj {

	public static void main(String[] args) {
		
		System.out.println("This is my first git prj.");
		
		for(int i = 0; i < 10; i++) {
			System.out.println("This is my first git prj.");
			System.out.println(i+"");
			print(i + "");
		}
		
		System.out.println(getRemoveVal(0));
		
	}
	
	public static void print(String msg) {
		System.out.println(msg);
	}
	
	/**
	 * 
	 * @param val
	 * @return
	 */
	private static int getRemoveVal(int val) {
		return 1 << val;
	}

}
