package prob02;

import java.util.Scanner;

public class Prob02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] intArray = new int[ 5 ];
		double sum = 0;

		/* 키보드에서 배열 크기만큼 입력 받아 배열에 저장하는 코드 */
		for(int i=0; i < intArray.length; i++) {
			System.out.print("입력하세요 : ");
			intArray[i] = scanner.nextInt();
		}
			
		/* 배열에 저장된 정수 값 더하기 */
		for(int i = 0; i < intArray.length; i++) {
			sum += intArray[i];
		}
		
		/* 출력 */
		System.out.println();
		System.out.println("배열에 저장된 값을 더하세요 : " +  sum );
		System.out.println();
		
		/* 자원정리 */
		System.out.println("배열을 정리하세요 :");
		for(int i=0; i < intArray.length; i++) {
			System.out.print(intArray[i] + " ");
		}
		scanner.close();
	}
}
