package inputExamples;
import java.util.Random;

public class ThreadExample extends Thread {

	private int sides;
	private int howMany;
	private Random roll;

	public ThreadExample(int s, int hm) {
		sides = s;
		howMany = hm;
		roll = new Random();
	}

	public void run() {
		int heads=0;
		for(int i = 0; i<howMany; i++)
			if(roll.nextInt(howMany) == 0)
				heads++;
		if(((double)heads)/howMany > 1.0/howMany)
			System.out.println("You won!!");
		else
			System.out.println("You lost!!");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ThreadExample[] threadArray = new ThreadExample[10];
			for (int i = 0; i < threadArray.length; i++) {
				threadArray[i] = new ThreadExample(((int)Math.random()*100), i*1000);
				threadArray[i].run();
			}
			for (int i = 0; i < threadArray.length; i++) {
				threadArray[i].join();
			}

		} catch (InterruptedException e) {
			System.out.println("Error");
		}
		System.out.println("Finished");

	}

}
