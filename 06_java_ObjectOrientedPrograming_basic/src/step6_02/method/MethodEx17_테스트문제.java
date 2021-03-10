package step6_02.method;

import java.util.Random;
import java.util.Scanner;

class SpeedGame {

	Scanner scan = new Scanner(System.in);
	Random ran = new Random();

	int[][] front = new int[3][3];
	int[][] back = new int[3][3];

	int num = 1;

	
	// 숫자 셋팅하기
	void setNumber() {
		for(int i = 0 ; i < 3; i++) {
			for(int j = 0 ; j < 3; j ++) {
				front[i][j] = num;
				num++;
			}
		}
		for(int i = 0 ; i < 3; i ++) {
			for(int j = 0 ; j < 3; j++) {
				back[i][j] = num;
				num++;
			}
		}
	}

	
	
	// 카드 섞기
	void suffleCard() {
		int mixCard = 0 ;
		int mixTemp = 0 ;
		while(mixCard == 1000) {
			mixTemp = front[0][0];
			int randIndex1 = ran.nextInt(3);
			int randIndex2 = ran.nextInt(3);
			
			front[0][0] = front[randIndex1][randIndex2];
			front[randIndex1][randIndex2] = mixTemp;
			
			mixCard ++;
		}
	}
	

	
	
	// 화면 출력하기
	void showCard() {
		for(int i = 0 ; i < 3; i++) {
			for(int j = 0 ;j < 3; j++) {
				System.out.print(front[i][j] +  "   ");
			}
			System.out.println();
		}
	}

	
	
	// 입력받기
	void selectCard() {
		int answer = 1;
		int backY = 0;
		int backX = 0;
		System.out.println("Y 입력 : ");
		int frontY = scan.nextInt();
		System.out.println("X 입력 : ");
		int frontX = scan.nextInt();
		
		if(front[frontY][frontX] == answer	) {
			front[frontY][frontX] = back[backY][backX];
			answer++;
			//back 앞으로 정렬
			for(int i = 0 ; i < 3; i++) {
				for(int j = 0 ; j < 3  ;j++) {
					if(i == 0 && j == 0) 	continue;
					back[i][j-1] = back[i][j];
				}
			}
		}
	}

	
	
	void run() {

		setNumber();
		suffleCard();

		while (true) {

			showCard();

			// 종료하기
			if (num == 19) {
				System.out.println("게임종료");
				break;
			}

			selectCard();
		}
	}
	
}



public class MethodEx17_테스트문제 {

	public static void main(String[] args) {
		
		SpeedGame sg = new SpeedGame();
		sg.run();

	}

}
