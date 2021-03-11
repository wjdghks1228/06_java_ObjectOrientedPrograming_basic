package step6_02.method;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class SpeedGame {

	Scanner scan = new Scanner(System.in);
	Random ran = new Random();

	int[][] front = new int[3][3];
	int[][] back = new int[3][3];

	int num = 1;
	int answer = 1;
	
	//back index
	int backY = 0;
	int backX = 0;
	
    //숫자 셋팅
	void setNum() {
		for(int i = 0 ; i < 3; i++) {
			for(int j = 0 ; j < 3; j++) {
				front[i][j] = num++;
			}
		}
		for(int i = 0 ; i < 3; i++) {
			for(int j = 0 ;j <3 ;j++) {
				back[i][j] = num++;
			}
		}
	}
	//front 섞기
	void mixFront  () {
		int mixIndex = 0;
		while(mixIndex < 1000	) {
			int ranY = ran.nextInt(3);
			int ranX = ran.nextInt(3);
			int temp = front[0][0];
			front[0][0] = front[ranY][ranX];
			front[ranY][ranX] = temp;
			mixIndex ++ ;
		}
	}
	//게임판 출력
	void printBoard ( ) {
		System.out.println("[FRONT]");
		for(int i = 0 ; i < 3; i++) {
			for(int j = 0 ; j <3; j++) {
				System.out.print("[" + front[i][j]+ "]" + "   ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("[BACK]");
		for(int i = 0 ; i < 3; i++) {
			for(int j = 0 ; j <3; j++) {
				System.out.print("[" + back[i][j]+ "]" + "   ");
			}
			System.out.println();
		}
	}
	//숫자 선택
	void selectNum() {
		System.out.println();
		System.out.println("찾을 숫자 [" + answer + "]");
		
		System.out.println("Y 인덱스 입력 : ");
		int pickY = scan.nextInt();
		System.out.println("X 인덱스 입력 : ");
		int pickX = scan.nextInt();
		for(int i = 0 ; i < 3 ; i++) {
			for(int j = 0 ; j< 3; j++) {
				if(front[pickY][pickX] == answer) {
					front[pickY][pickX] = back[backY][backX];
					back[backY][backX] = 0;
					backY = answer % 3;
					answer++;
				}
			}
		}
	}
	//게임판 정렬
	void run() {
		setNum();
		mixFront();
		while(true) {
			if(answer == 20 ) break; 
			printBoard();
			selectNum();
		}
	}
}
	
public class MethodEx17_테스트문제 {

	public static void main(String[] args) {
		SpeedGame game = new SpeedGame();
		game.run();
	}
}
