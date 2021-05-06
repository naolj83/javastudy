package thread;

public class ThreadEx02 {

	public static void main(String[] args) {
	// 자바는 쓰레드가 하나라도 남아있으면 종료되지 않는다.	
	Thread thread1 = new DigitThread();
	Thread thread2 = new AlphabetThread();
	
	thread2.start();
	thread1.start();
	}

}
