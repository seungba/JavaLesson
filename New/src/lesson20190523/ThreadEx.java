package lesson20190523;

public class ThreadEx extends Thread {
	
	public void run() {
		for(int i = 1; i<=10; i++) {
			try {
				System.out.println(i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		ThreadEx a = new ThreadEx();
		a.run();
		
		for(int i = 100; i<110; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("a");
		}
	}

}
