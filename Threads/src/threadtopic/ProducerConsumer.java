package threadtopic;

class Producer1{
	public  boolean isPresent=true; 
	public synchronized void printConsumer() {
		for(int i=1;i<=5;i++)
		{
			while(!isPresent)
			{
				try {
					wait();

				}catch (Exception e) {
					e.printStackTrace();
				}
			}
			System.out.println("t1:"+"consumer");
			try {
                Thread.sleep(500); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
			isPresent=false;
			notify();
		}
	}
	public synchronized void printProducer() {
		for(int i=1;i<=5;i++)
		{
			while(isPresent)
			{
				try {
					wait();
				}catch (Exception e) {
					e.printStackTrace();
				}
			}
			System.out.println("t2:"+"producer");
			try {
                Thread.sleep(500); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
			isPresent=true;
			notify();
		}
	}
}

public class ProducerConsumer {
	
	public static void main(String[] args) throws InterruptedException {
	    Producer1 producer=new Producer1();
//	    Thread t1=new Thread(()->producer.printConsumer());
//	    Thread t2=new Thread(()->producer.printProducer());
	    Runnable consumerTask=new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				producer.printConsumer();
				
			}
	    	
	    };
	    
	    Runnable producerTask=new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				producer.printProducer();
			}
	    	
	    };
	    Thread t1=new Thread(consumerTask);
	    Thread t2=new Thread(producerTask);
	    t1.start();
	    t2.start();
	}

}
