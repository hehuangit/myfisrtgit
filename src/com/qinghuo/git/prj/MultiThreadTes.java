package com.qinghuo.git.prj;

public class MultiThreadTes {

	public static void main(String[] args) {
		
		for(int i = 0; i < 10; i++) {
			new Thread(new MyTestJob()).start();
		}
	}

	static class MyTestJob implements Runnable {

		boolean flag = false;
		int i = 0;
		
		public void setValues() {
			i = 1;
			flag = true;
		}
		
		public int getVal() {
			if(flag) {
				return i;
			}
			return 0;
		}
		@Override
		public void run() {
			setValues();
			System.out.println("i = " + i);
		}
		
	}
}
