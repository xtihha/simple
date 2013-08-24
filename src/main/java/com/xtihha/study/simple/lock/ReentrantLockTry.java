package com.xtihha.study.simple.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockTry {

	private Object sync = new Object();

	private int count = 1;

	public void tryLock() {
		synchronized (sync) {
			count++;
			synchronized (sync) {
				count++;
			}
		}

		System.out.println(count);
	}

	public void tryLock2() {
		Lock lock = new ReentrantLock();
		
		lock.lock();
		count++;
		{
			lock.lock();
			count++;
			lock.unlock();
		}
		lock.unlock();
		
		System.out.println(count);
	}

	public static void main(String[] args) {
		ReentrantLockTry lockTry = new ReentrantLockTry();
		lockTry.tryLock();
		lockTry.tryLock2();
	}

}
