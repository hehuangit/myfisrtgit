package com.qinghuo.git.observer;

public class MyEventListener implements DemoEventListener {

	@Override
	public void handleEvent(DemoEvent demoEvent) {
		System.out.println("�������¼���,���÷���MyEventListener��handleEvent()");
		demoEvent.say();
	}

}
