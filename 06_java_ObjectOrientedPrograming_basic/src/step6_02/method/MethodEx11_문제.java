package step6_02.method;



class Ex11{
	
	int test1(int[] arr) { 
		int total = 0 ;
		for(int i = 0 ; i< arr.length; i++) {
			total += arr[i];
		}
		return total;
	}
	
	int test2(int[] arr) {
		int fourTotal = 0;
		for(int i = 0 ; i < arr.length; i++	) {
			if(arr[i] % 4 == 0) {
				fourTotal += arr[i];
			}
		}
		return fourTotal; 
	}
	int test3(int[] arr) {
		int fourCnt = 0;
		for(int i = 0 ;i < arr.length; i++) {
			if(arr[i]%4 == 0) {
				fourCnt ++;
			}
		}
		return fourCnt; 		
	}
	int test4(int[] arr) {
		int twoCnt = 0 ;
		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[i] % 2 == 0) {
				twoCnt++;
			}
		}
		return twoCnt; 
	}

}




public class MethodEx11_문제 {

	public static void main(String[] args) {

		
			Ex11 e = new Ex11();
			
			int[] arr = {87, 100, 11, 72, 92};
	
			// 문제 1) 전체 합 리턴
			// 정답 1) 362
			int tot = e.test1(arr);
			System.out.println("tot = " + tot);								
			// 문제 2) 4의 배수의 합 리턴
			// 정답 2) 264
			tot = e.test2(arr);
			System.out.println("tot = " + tot);	
			// 문제 3) 4의 배수의 개수 리턴
			// 정답 3) 3
			int cnt = e.test3(arr);
			System.out.println("cnt = " + cnt);	
			// 문제 4) 짝수의 개수 리턴
			// 정답 4) 3
			cnt = e.test4(arr);
			System.out.println("cnt = " + cnt);
		

	}

}
