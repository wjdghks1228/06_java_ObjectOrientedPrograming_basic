package step6_02.method;
/*
 * 
 *  # 클래스의 구성요소
 *  
 *  [1] 변수
 *  [2] 메서드(method)
 * 
 * 
 * 	2-1) void : return 타입 (int,double,char,String,int[]....)
 * 	2-2) printMenu  : 메서드명 ( 주로 소문자로 시작하고 동사형태로 작명한다. )
 *  2-3) ()   : 입력인수
 *  2-4) {}   : 메서드의 영역
 *  
 * */


class MethodEx{ //세탁기
	void printMenu() { //헹굼
		System.out.println("=================================");
		System.out.println("1.로그인");
		System.out.println("2.로그아웃");
		System.out.println("3.정보조회");
		System.out.println("4.정보수정");
		System.out.println("5.종료");
		System.out.println("=================================");
		return ; // void 일때는 생략 가능
	}
	
}
public class MethodEx01 {
	//method == 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodEx method = new MethodEx();
	//  세탁기  제품1 = new  세탁기
		method.printMenu();
		method.printMenu();
		method.printMenu();
		method.printMenu();
	}

}
