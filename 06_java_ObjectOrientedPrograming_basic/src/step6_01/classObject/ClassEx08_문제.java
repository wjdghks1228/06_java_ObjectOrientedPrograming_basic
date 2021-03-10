package step6_01.classObject;
/*
 * # 숫자이동[3단계] : 클래스 + 변수
 * 1. 숫자2는 캐릭터이다.
 * 2. 숫자1을 입력하면, 캐릭터가 왼쪽으로
 * 	    숫자2를 입력하면, 캐릭터가 오른쪽으로 이동한다.
 * 3. 숫자 1은 벽이다. 벽을 만나면 이동할 수 없다.
 * 4. 단, 숫자3을 입력하면, 벽을 격파할 수 있다.
 * 5. 좌우 끝에 도달해도 계속 반대편으로 이동이 가능하다.
 * 예) 
 *  0 0 0 0 0 0 0 2 
 *  왼쪽(1) 오른쪽(2) : 2
 *  
 *  2 0 0 0 0 0 0 0 
 */

import java.util.Scanner;

class Ex08{
	int[] game = {0, 0, 1, 0, 2, 0, 0, 1, 0};
}



public class ClassEx08_문제 {

	public static void main(String[] args) {
		Ex08 myGame = new Ex08();
		Scanner scan = new Scanner(System.in);
		
		int player = 0 ;
		//주인공 위치
		for(int i = 0 ; i < myGame.game.length; i++) {
			if(myGame.game[i] == 2 ) {
				player  = i ;
			}
		}
		
		while(true) {
			for(int i = 0 ; i < myGame.game.length; i++) {
				System.out.print(myGame.game[i]	+ " ");
			}
			System.out.println();
			System.out.println("<<-- [1]         [2] -->>");
			int move = scan.nextInt();
			if( move == 1) {
				if(myGame.game[player - 1] == 1 || (player - 1 ) < 0) {
					continue;
				}
				else if(myGame.game[player - 1] != 1 && player != 0) {
					player --;
					myGame.game[player] = 0;
					myGame.game[player-1] = 2;
				}
			}
			else if( move == 2) {
				if(myGame.game[player + 1] == 1 || player > 8) {
					continue;
				}
				else if (myGame.game[player + 1 ] != 1 && player != 7) {
					player++;
					myGame.game[player]= 0 ;
					myGame.game[player + 1]= 2 ;
				}
			}
		}
	}

}
