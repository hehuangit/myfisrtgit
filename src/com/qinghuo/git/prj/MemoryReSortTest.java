package com.qinghuo.git.prj;
/**
 * œﬂ≥Ã÷ÿ≈≈–Ú≤‚ ‘.
 * @author hehuan
 *
 */
public class MemoryReSortTest {

	static int x = 0,y = 0;
	static int a = 0,b = 0;
	
	public static void main(String[] args) {
		
		Thread xJob = new Thread(new ModifyXJob());
		Thread yJob = new Thread(new ModifyYJob());
		
		xJob.start();
		yJob.start();
		
		try {
			xJob.join();
			yJob.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("x = " + x + ",y = " + y);
		System.out.println(x + y);
	}
	/**
	 * 
	 * @author hehuan
	 *
	 */
	static class ModifyXJob implements Runnable {
		@Override
		public void run() {
			a = 1;
			x = a;
		}
	}
	static class ModifyYJob implements Runnable {
		@Override
		public void run() {
			b = 1;
			y = b;
		}
	}

}
