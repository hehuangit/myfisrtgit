package com.qinghuo.git.observer;

import java.util.EventListener;

public interface DemoEventListener extends EventListener {

	public void handleEvent(DemoEvent demoEvent);
}
