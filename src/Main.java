import java.util.Timer;

public class Main {
	public static void main(String args[]) throws InterruptedException {
		int a =(int)System.currentTimeMillis() /1000;
		Thread.sleep(2000);
		int b = (int)System.currentTimeMillis() /1000- a;
		System.out.println(b);
	}
}
