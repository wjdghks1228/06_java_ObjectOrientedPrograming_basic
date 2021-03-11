package step6_02.method;

class MethodOverloadingEx{
	//Method OverLoading (메서드 오버로딩)
	//Method 이름이 같으면 안되지만 뒤에 타입과 개수가 다르면 중복되도 상관없다.
	int add(int x , int y){
		return x + y;
	}
	int add(int x , int y, int z) {
		return x+y+z;
	}
	double add(double x, double y ) {
		return x + y;
	}
	int add(int[] arr) {
		int total = 0 ;
		for(int i = 0 ; i < arr.length; i++)	{
			total += arr[i];
		}
		return total;
	}
}

public class MethodEx18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodOverloadingEx obj = new MethodOverloadingEx();
		int return1 = obj.add(3, 7);
		int [] arr = { 1,2,3,4,5};
		int return2 = obj.add(3,6,10);
		double return3 = obj.add(3.15, 6.15);
		int return4 = obj.add(arr);
	}

}
