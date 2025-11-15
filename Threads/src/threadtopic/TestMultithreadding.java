package threadtopic;

public class TestMultithreadding {
	public static void main(String[] args) throws Exception {
//		System.out.println("hello world");
//		System.out.println (Thread.currentThread().getName());
		
		Runnable r1=()->{ 
			for(int i=0;i<10;i++) {
				System.out.println("hello"+Thread.currentThread().getName());
		    }
			
		};
		Runnable r2=()->{ 
			for(int i=0;i<10;i++) {
				System.out.println("hi"+Thread.currentThread().getName());
		    }
			
		};
		
		Thread t1=new Thread(r1,"T1");
		Thread t2=new Thread(r2,"T2");

		t1.start();
		t1.join();
		t2.start();
	}

}
