package threadtopic;

public class PrintNmbers {
	private final static Object lock=new Object();
	public static void main(String[] args) throws InterruptedException {
		Thread t1=new Thread(()->
		{
			for(int i=1;i<=10;i++)
			{
//				synchronized (lock) {
					
				
				System.out.println("thread1 "+i+"-"+Thread.currentThread().getPriority());

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
//			  }
		}
			System.out.println("thank you");
		});
		
		Thread t2=new Thread(()->
		{
			for(int i=1;i<=10;i++)
			{
//			synchronized (lock) {
					
				
				System.out.println("thread2 "+i+"-"+Thread.currentThread().getPriority());

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
//				}
		}
			System.out.println("thank you");
		});
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		t1.start();
//		t1.join();

		t2.start();
		
//		t2.join();
				
	}

}
