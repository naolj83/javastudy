package thread;

public class UppercaseAlphabetThread {
// 대문자 출력하기
	public void print() {
		for(char c = 'A'; c <= 'Z'; c++) {
			System.out.print(c);
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
