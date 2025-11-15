package threadtopic;

class Resources{
	 String name;
	public Resources(String name)
	{
		this.name=name;
	}
}

public class DeadLockExample {
	public static void main(String[] args) {
		Resources resource1=new Resources("Resource1");
		Resources resource2=new Resources("Resource2");
		Thread t1=new Thread(()->{
		synchronized (resource1) {
			System.out.println("Thread 1 locks "+resource1.name);
		 try {
			Thread.sleep(1000);
		 }catch(InterruptedException e){
			 e.printStackTrace();
			 
		 }
		 synchronized (resource2) {
			 System.out.println("Thread 2 locks "+resource2.name);
			 
			
		}
		}
	});
		Thread t2=new Thread(()->{
			synchronized (resource2) {
				System.out.println("Thread 1 locks "+resource2.name);
			 try {
				Thread.sleep(1000);
			 }catch(InterruptedException e){
				 e.printStackTrace();
				 
			 }
			 synchronized (resource1) {
				 System.out.println("Thread 2 locks "+resource1.name);
				 
				
			}
			}
		});
		t1.start();
		t2.start();


	}
}


