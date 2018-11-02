package inputExamples;

public class ThreadExample2 extends Thread {
	public ThreadExample2() {
	}

	public void run() {
		System.out.println("Hello world!!");
	}

	public static void main(String[] args) {
			// TODO Auto-generated method stub
			try {
				ThreadExample2 t1 = new ThreadExample2();
				ThreadExample2 t2 = new ThreadExample2();
				t1.run();
				t2.run();
				t1.join();
				t2.join();
			}catch(

	InterruptedException e)
	{
		System.out.println("Error");
	}
}

}
