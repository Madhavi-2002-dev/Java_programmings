package threadtopic;

public class PingPongRunner {
	private boolean isPresent=true;
	 private final static Object lock = new Object(); // Lock object to synchronize both threads

	public static void main(String[] args) {
		PingPongRunner pingPongRunner=new PingPongRunner();
		
		Thread t1=new Thread(()->
		    {
					
				
		    	for(int i=1;i<=10;i++) {
			    	synchronized (lock) {

		    	    while(!pingPongRunner.isPresent)
		            	{
		    		      try {
						lock.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		    	}
		    	
		    	System.out.println("thread1 "+Thread.currentThread().getName()+"Ping");
		    	pingPongRunner.isPresent=false;
		    	lock.notify();
		    	}
		    	}
		    });
		
		Thread t2=new Thread(()->
	    {
				
			
	    	for(int i=1;i<=10;i++) {
		    	synchronized (lock) {

	    	while(pingPongRunner.isPresent)
	    	{
	    		try {
					lock.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	    	}
	    	
	    	System.out.println("thread2 "+Thread.currentThread().getName()+"pong");
	    	pingPongRunner.isPresent=true;
	    	lock.notify();
	    	}
	    }
	    });
	    
		t1.start();
		t2.start();
	

	}

}
