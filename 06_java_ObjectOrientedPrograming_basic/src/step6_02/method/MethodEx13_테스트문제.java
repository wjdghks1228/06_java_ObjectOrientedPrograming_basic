 package step6_02.method;

import java.util.Arrays;
import java.util.Scanner;

/*
 * # 영화관 좌석예매 : 클래스 + 메서드
 * 1. 사용자로부터 좌석번호(index)를 입력받아 예매하는 시스템이다.
 * 2. 예매가 완료되면 해당 좌석 값을 1로 변경한다.
 * 3. 이미 예매가 완료된 좌석은 재구매할 수 없다.
 * 4. 한 좌석당 예매 가격은 12000원이다.
 * 5. 프로그램 종료 후, 해당 영화관의 총 매출액을 출력한다.
 * 예)
 * seat = 0 0 0 0 0 0 0
 * 
 * 좌석선택 : 1
 * seat = 0 1 0 0 0 0 0
 * 
 * 좌석선택 : 3
 * seat = 0 1 0 1 0 0 0
 * 
 * 좌석선택 : 3
 * seat = 0 1 0 1 0 0 0
 * 이미 예매가 완료된 자리입니다.
 * ----------------------
 * 매출액 : 24000원
 */

class Theater{
	Scanner scan = new Scanner(System.in);
	
	int seat[] = new int [7];
	int money = 0 ;
	int bookCount = 0;
	int log = 1;
	
	//좌석보여주기
	void showSeat() {
		System.out.println(Arrays.toString(seat));
	}
	//좌석선택
	void choiceSeat() {
		System.out.println("좌석을 선택하세요 : ");
		System.out.println("종료원할시 9 클릭");
		showSeat();
		
		int pick = scan.nextInt();
		if(pick == 9) {
			log = 2;
			return;
		}
		if(bookCount > 7) {
			System.out.println("현재 만석으로 예매가 불가능 합니다.");
			return;
		}
		if(seat[pick] == 1) {
			System.out.println("이미 선택된 좌석입니다.");
		}
		else if(seat[pick] == 0 	) {
			seat[pick] = 1;
			bookCount ++;
		}
	}
	//계산
	void payMoney() {
		System.out.println("총 지불 금액은 " + bookCount * 12000);
	}
	//실행
	void run() {
		while(true) {
			if(log == 2) {
				break;
			}
			showSeat();
			choiceSeat();
		}
		payMoney();
	}
}

public class MethodEx13_테스트문제 {

	public static void main(String[] args) {
		Theater cgv = new Theater();
		cgv.run();
	}
}

