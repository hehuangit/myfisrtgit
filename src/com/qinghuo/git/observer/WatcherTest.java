package com.qinghuo.git.observer;

public class WatcherTest {

	public static void main(String[] args) {
		BeingWatched bw = new BeingWatched();
		Watcher watch = new Watcher();
		
		bw.addObserver(watch);
		bw.counter(10);
	}

}
