package com.busyqa.course.concurrency.synchronization;

import java.util.ArrayList;
import java.util.List;

public class TestSynchronization {
	public static void main(String[] args) {
		List<Integer> taskQueue = new ArrayList<Integer>();
		int MAX_CAPACITY = 30;
		Thread tProducer = new Thread(new Producer(taskQueue, MAX_CAPACITY), "Producer");
		tProducer.setPriority(Thread.MIN_PRIORITY);
		Thread tConsumer = new Thread(new Consumer(taskQueue), "Consumer");
		tConsumer.setPriority(Thread.MAX_PRIORITY);
		tProducer.start();
		tConsumer.start();
	}
}