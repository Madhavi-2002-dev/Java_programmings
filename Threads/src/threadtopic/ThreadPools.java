package threadtopic;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPools {
	public static void main(String[] args) {
		ExecutorService executorService=Executors.newFixedThreadPool(3);
		System.out.println("fixedThread pool");
		for(int i=1;i<=5;i++)
		{
			final int taskID=i;
//			executorService.execute(()->{
//				System.out.println("fixedThread task "+taskID+" executed by thread"+Thread.currentThread().getName());
//				try {
//					Thread.sleep(1000);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			});
			Runnable runnable=new Runnable() {
				
				@Override
				public void run() {
					System.out.println("fixedThread task "+taskID+"executed by "+Thread.currentThread().getName());	
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			};
			executorService.execute(runnable);
			
		}
		executorService.shutdown();
	}
}


