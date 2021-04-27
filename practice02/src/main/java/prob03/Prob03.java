package prob03;

public class Prob03 {


		// 원래 배열 원소 출력
		static void charprintCharArray(char a[]) {
			System.out.println(a);
		}
		
		
		
		// 공백 문자 바꾸기
		static void replaceSpace(char a[]) {
			for (int i = 0; i < a.length; i++)
				if (a[i] == ' ')
					a[i] = '-';

		}
		// 수정된 배열 원소 출력
		static void printCharArray(char a[]) {
			for (int i = 0; i < a.length; i++)
				System.out.print(a[i]);
		}

		public static void main(String args[]) {
			char c[] = { 'T', 'h', 'i', 's', ' ', 'i', 's', ' ', 'a', ' ', 'p', 'e', 'n', 'c', 'i', 'l', '.' };

			charprintCharArray(c);
			replaceSpace(c);
			printCharArray(c);
			
		}

}