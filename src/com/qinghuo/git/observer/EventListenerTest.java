package com.qinghuo.git.observer;

public class EventListenerTest {

	public static void main(String[] args) {
		
		DemoSource demoSource = new DemoSource();
		DemoEventListener del = new MyEventListener();
		
		demoSource.addEventListener(del);
		demoSource.addEventListener(new DemoEventListener() {
			@Override
			public void handleEvent(DemoEvent demoEvent) {
				System.out.println("Enter into method handleEvent");
				demoEvent.say();
			}
		});
		
		demoSource.changeVal();
		
	}

}
