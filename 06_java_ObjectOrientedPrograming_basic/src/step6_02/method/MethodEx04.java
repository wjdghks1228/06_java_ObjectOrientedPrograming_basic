package step6_02.method;

//this : 인스턴스(객체) 변수 자신

//Zealot z1 = new Zealot();
//               new 해서 나온것  -> 객체 = 인스턴스
 
class Zealot{
	int shield = 60;
	int hp = 100;
	int attack = 16;

	void showStatus() {
		System.out.println(this);
		System.out.println("shiled = " + this.shield);
		System.out.println("hp = " + this.hp);
		System.out.println("attack = " + this.attack);
		System.out.println();
		
		//this 는 생략이 가능하다
		//가독성 향상을 위해서 this 를 붙이는 것을 권한다
		System.out.println(this);
		System.out.println("shiled = " + shield);
		System.out.println("hp = " + hp);
		System.out.println("attack = " + attack);
		System.out.println();
	}
}


public class MethodEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//질럿 세마리 생성
		Zealot z1 = new Zealot();
		System.out.println(z1);
		z1.shield = 0;
		z1.hp = 0;
		z1.showStatus();
		
		Zealot z2 = new Zealot();
		System.out.println(z2);
		z2.shield = 0;
		z2.showStatus();
		
		Zealot z3 = new Zealot();
		System.out.println(z3);
		z3.showStatus();
		
	}

}
