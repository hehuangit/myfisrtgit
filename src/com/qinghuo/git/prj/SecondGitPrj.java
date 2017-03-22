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


