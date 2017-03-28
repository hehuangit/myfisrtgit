package com.qinghuo.git.observer;

import java.util.Observable;
/**
 * ±»¹Û²ìÕß.
 * @author hehuan xxxxx
 *
 */
public class BeingWatched extends Observable {

	void counter(int period) {
		for(;period >= 0; period--) {
			this.setChanged();
			this.notifyObservers(new Integer(period));
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				System.out.println("Sleep interrupte");
			}
		}
	}

	@Override
	public String toString() {
		return "***********************";
	}
	
	
	

	
}
