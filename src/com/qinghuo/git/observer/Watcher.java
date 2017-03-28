package com.qinghuo.git.observer;

import java.util.Observable;
import java.util.Observer;
/**
 * π€≤Ï’ﬂ°£
 * @author hehuan
 *
 */
public class Watcher implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		System.out.println(o.toString());
		System.out.println("update() is called,the count is " + ((Integer)arg).intValue());
	}

}
