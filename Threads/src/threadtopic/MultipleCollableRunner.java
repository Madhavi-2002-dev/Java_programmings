package threadtopic;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultipleCollableRunner {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executorService=Executors.newFixedThreadPool(3);
		List<CollableTask> tasks=List.of(new CollableTask("madhu"),new CollableTask("Ranga"),new CollableTask("Adam"));
		List<Future<String>> results=executorService.invokeAll(tasks);
		for(Future<String> result:results)
		{
			System.out.println(result.get());
		}
		executorService.shutdown();
	}
	

}
