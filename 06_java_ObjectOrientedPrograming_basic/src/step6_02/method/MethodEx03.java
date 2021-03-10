package step6_02.method;

class ReturnEx{
	void setScore1(int score1) {
		score1 = 100;
	}
	int setScore2 (int score2) {
		score2 = 100;
		return score2;
	}
	int testReturn() {
		System.out.println("리턴전 명령어 1");
		System.out.println("리턴전 명령어 1");
		System.out.println("리턴전 명령어 1");
		return 1;
	}
}
public class MethodEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReturnEx obj = new ReturnEx();
		
		int score1 = 87;
		System.out.println("메서드 호출전의 성적  = " + score1);
		obj.setScore1(score1);
		System.out.println("메서드 호출후의 성적  = " + score1);
		System.out.println("==================================");
		int score2 = 87;
		System.out.println("메서드 호출전의 성적  = " + score2);
		obj.setScore2(score2);
		System.out.println("메서드 호출후의 성적  = " + score2);
		
		score2 = obj.setScore2(score2);
		System.out.println("메서드 호출후의 성적  = " + score2);
		
	}

}
