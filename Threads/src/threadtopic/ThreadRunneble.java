package threadtopic;
class task1 extends Thread{
	public void run() {
	for(int i=101;i<=299;i++)
	{
		System.out.print(i+",");
		
	}
	System.out.println("task1 done");

	}
}
class task2 implements Runnable{
	public void run() {
	for(int i=201;i<=399;i++)
	{
		System.out.print(i+",");
	}
	System.out.println("task2 done");

	}
}
public class ThreadRunneble {
	public static void main(String[] args) { 
	
		task1 task1=new task1();
		task1.start();
		System.out.println("task1 Kicked off");
		
		task1.setPriority(1);
		
	
		task2 task2=new task2();
		Thread threadtask2=new Thread(task2);
		threadtask2.setPriority(10);
		threadtask2.start();
		System.out.println("task2 Kicked off");
		
		
	}
	

}
