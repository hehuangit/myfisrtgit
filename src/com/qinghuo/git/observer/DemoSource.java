package com.qinghuo.git.observer;

import java.util.Enumeration;
import java.util.Vector;

/**
 * 真正的事件源.
 * @author hehuan
 *
 */
public class DemoSource {

	private Vector<DemoEventListener> vector = new Vector();
	
	public void addEventListener(DemoEventListener listener) {
		vector.add(listener);
	}
	
	public void notifyAllListeners() {
		Enumeration<DemoEventListener> enume = vector.elements();
		while(enume.hasMoreElements()) {
			DemoEventListener eventListener = enume.nextElement();
			eventListener.handleEvent(new DemoEvent(this));
		}
	}
	
	public void changeVal() {
		 notifyAllListeners();
	}
	
}
