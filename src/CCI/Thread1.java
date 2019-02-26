
public class Thread1 implements Runnable {
	
	String name;
	public static void main(String s[]) {
		
		new Thread(new Thread1("a")).start();
		new Thread(new Thread1("b")).start();
		
		
		System.out.print("1");
		
				System.out.print("2");
		
		
	}
	Thread1(String h){
		name =h;
	}
	public void run() {
		message(1);
		message(2);
	}

	public synchronized void message(int a) {
		System.out.println(name+"-"+a);
	}
	
}
