package com.qinghuo.git.observer;

import java.util.EventObject;

public class DemoEvent extends EventObject {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public DemoEvent(Object source) {
		super(source);
	}

	public void say() {
		System.out.println("say hello to everybody.");
	}
}
