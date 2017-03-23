package com.qinghuo.git.prj;
/**
 * 
 * @author hehuan
 *
 */
public class SecondGitPrj {

	public static void main(String[] args) {
		
		for(int i = 0; i < 10; i++) {
			new Thread(new MyJob()).start();
		}
		
		System.out.println("======" + getVal(16));

	}
	
	private static int getVal(int feet) {
		return feet >>> 1;
	}
	static class MyJob implements Runnable {
		@Override
		public void run() {
			for(int i = 0; i < 10; i++) {
				System.out.println(Thread.currentThread().getName() + "-" + i);
			}
		}
		
	}

}


