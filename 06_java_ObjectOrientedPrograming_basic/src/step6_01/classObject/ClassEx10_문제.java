package step6_01.classObject;
/*
 * # 영수증 출력하기 : 클래스 + 변수
 * 1. 햄버거 주문을 받아 영수증을 출력한다.
 * 2. 출력내용은 각 메뉴의 주문 수량과 총 금액 및 잔돈을 표시한다.
 * 
 * 	맘스터치
 *----------------------
 *ITEM	QTY	AMT
 *치즈버거	1	2500
 *불고기버거	1	3800
 *감자튀김	1	1500
 *콜      라	1	1000
 *----------------------
 *합계금액		8800
 *받은금액		10000
 *----------------------
 *잔       돈		1200
 */

import java.util.Arrays;
import java.util.Scanner;

class Ex10 {
	String name = "";		// 가게 이름
	
	int[] arPrice   = {  2500, 3800, 1500, 1000  };
	String[] arMenu = {"치즈버거", "불고기버거", "감자튀김", "콜      라"};
	
	int[] arCount = new int[4];
	
	int total = 0;
}


public class ClassEx10_문제 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Ex10 store = new Ex10();
		
		store.name = "맥도날드"	;
		
		while(true) {
			System.out.println("[메세지] 메뉴선택 끝나시면 9를 입력하세요");
			System.out.println("메뉴선택 : [1] [2] [3] [4]");
			System.out.println(Arrays.toString(store.arMenu));
			System.out.println(Arrays.toString(store.arPrice));
			int pick  = scan.nextInt();
			if(pick == 9) break;
	
			store.total += store.arPrice[pick-1];
			store.arCount [pick-1] ++;
		}
		
		System.out.println("--------------------------------------");
		System.out.println("[ 주문내역 ]");
		for(int i = 0 ; i < store.arCount.length; i++) {
			System.out.println(store.arMenu[i] + " : " + store.arCount[i] + "       " + store.arCount[i]*store.arPrice[i] +  "원"); 
		}
		System.out.println("--------------------------------------");
		System.out.println("합계 : " + store.total);
		System.out.println("지불하세요 : ");
		int pay = scan.nextInt();
		System.out.println("받은 금액 : " + pay);
		System.out.println("잔돈 : " + (pay - store.total));
		System.out.println("--------------------------------------");
	}

}
