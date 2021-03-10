package step6_02.method;

import java.util.Scanner;

class Ex05{

	void test1() {
		int sum = 0;
		for(int i =  1 ; i < 6; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
	
	void test2() {
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[3];
		for(int i = 0 ; i < 3; i++) {
			int num = scan.nextInt();
			arr[i] = num;
		}
		int maxNum = 0 ;
		for(int i = 0 ; i < 3; i++) {
			if ( arr[i] >= maxNum) {
				maxNum = arr[i];
			}
		}
		System.out.println(maxNum);
		scan.close();
	}
	
}

public class MethodEx05_문제 {

	public static void main(String[] args) {
		
	
			Ex05 e = new Ex05();
						
			// 문제 1) 1부터 5까지의 합을 출력하는 메서드
			e.test1();
			
			// 문제 2) 정수 3개를 배열에 입력받아 최대값을 출력하는 메서드
			e.test2();
		

	}

}
