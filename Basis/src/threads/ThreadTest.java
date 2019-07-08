package threads;

public class ThreadTest extends Thread implements Runnable{
	private int count=10;
	public void run(){
		System.out.println("Active threads: " + Thread.activeCount());
		System.out.println("Starting threads: " + Thread.currentThread().getName());
		try {
			Thread.sleep(3000);
			while(true){
				System.out.print(count + " ");
				if(--count == 0)
					return;
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("End thread: " + Thread.currentThread().getName());
	}
	
	public static void main(String[] args){
		new ThreadTest().start();
		Thread t2 = new Thread(new ThreadTest(), "Thread 2");
		Thread t3 = new Thread(new ThreadTest(), "Thread 3");
		Thread t4 = new Thread(new ThreadTest(), "Thread 4");
		t2.start();
		t3.start();
		try {
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t4.start();
	}
}


