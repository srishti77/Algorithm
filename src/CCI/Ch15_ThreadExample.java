package CCI;

public class Ch15_ThreadExample implements Runnable {

	public int count =0;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		System.out.println("Runnable Thread starting.");
		
		try {
			
			while(count <5) {
				System.out.println("count: "+count);
				Thread.sleep(500);
				count++;
			}
			
		}
		catch(Exception e) {
			System.out.println("RunnableThread interrupted");
		}
	}
	
	public static void main(String s[]) {
		Ch15_ThreadExample threadExample = new Ch15_ThreadExample();
		
		Thread th = new Thread(threadExample);
		th.start();
		
		while(threadExample.count!=5) {
			try {
				System.out.println("Thread less than 5");
				Thread.sleep(250);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}

