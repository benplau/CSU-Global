package portfolioproject;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class CSC450_PortfolioProject {

	private static final Lock lock = new ReentrantLock();
	private static final Condition countUpDone = lock.newCondition();
	private static boolean isCountUpDone = false;

	public static void main(String[] args) {
		Thread t1 = new Thread(new CountUp());
		Thread t2 = new Thread(new CountDown());

		t1.start();
		t2.start();

		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	static class CountUp implements Runnable {
		@Override
		public void run() {
			for (int i = 0; i <= 20; ++i) {
				lock.lock();
				try {
					System.out.println(i);
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				} finally {
					lock.unlock();
				}
			}
			lock.lock();
			try {
				isCountUpDone = true;
				countUpDone.signal();
			} finally {
				lock.unlock();
			}
		}
	}

	static class CountDown implements Runnable {
		@Override
		public void run() {
			lock.lock();
			try {
				while (!isCountUpDone) {
					countUpDone.await();
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			} finally {
				lock.unlock();
			}

			for (int i = 19; i >= 0; --i) {
				lock.lock();
				try {
					System.out.println(i);
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				} finally {
					lock.unlock();
				}
			}
		}
	}
}
