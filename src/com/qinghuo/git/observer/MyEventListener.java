package com.qinghuo.git.observer;

public class MyEventListener implements DemoEventListener {

	@Override
	public void handleEvent(DemoEvent demoEvent) {
		System.out.println("触发了事件了,调用方法MyEventListener。handleEvent()");
		demoEvent.say();
	}

}
