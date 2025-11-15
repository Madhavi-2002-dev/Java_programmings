package threadtopic;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class CollableTask implements Callable<String>{
    private String name;
    public CollableTask(String name) {
    	this.name=name;
    }
	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(1000);
		return "Hello"+name;
	}
	
}
public class CollableRunner {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executorService=Executors.newFixedThreadPool(1);
		Future<String> welcomeFuture=executorService.submit(new CollableTask("madhu"));
		String welcomeMessage=welcomeFuture.get();
		System.out.println(welcomeMessage);
		System.out.println("\n main complted");
		
	}

}
