package practise;

public class Utility { 
	int i;
	boolean bool=false;
	public synchronized void set(int i) throws Throwable {
	while(bool) {
		wait();
	}
	this.i=i;
	bool=true;
	System.out.println("Producer "+i);
	notify();
	}
	public synchronized void get() throws Throwable {
		while(!bool) {
			wait();
		}
		bool=false;
		System.out.println("Consumer "+i);
		notify();
	}
}
class Producer implements Runnable{
	private Utility utility;
	int i=0;
	public Producer(Utility utility) {
		this.utility=utility;
		Thread producer=new Thread(this,"Producer");
		producer.start();
	}
	public void run() {
		while(true) {
			try {
				utility.set(i++);
			}
			 catch (Throwable e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class Consumer implements Runnable{
	private Utility utility;
	public Consumer(Utility utility) {
		this.utility=utility;
		Thread consumer=new Thread(this, "Consumer");
		consumer.start();
	}
	public void run() {
		while(true) {
			try {
				utility.get();
			} catch (Throwable e) {
				e.printStackTrace();
			}
		}
	}
}
class ProducerConsumer{
	public static void main(String[] args) {
		Utility utility=new Utility();
		new Producer(utility);
		new Consumer(utility);
	}
}

