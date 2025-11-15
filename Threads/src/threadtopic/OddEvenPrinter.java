package threadtopic;



public class OddEvenPrinter {
	public static void main(String[] args) {
		Thread A=new Thread(()->{
			for(int i=1;i<=20;i++) {
				if(i%2==0)
				{
					System.out.println("Thread A: "+i);
				}
			}
		});
		Thread B=new Thread(()->{
			for(int i=1;i<=20;i++) {
				if(i%2==1)
				{
					System.out.println("Thread B: "+i);
					

				}
			}
		});
		A.start();
		B.start();

		
	}
}
