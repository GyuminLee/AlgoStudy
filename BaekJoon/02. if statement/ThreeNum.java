import java.util.Scanner;

public class ThreeNum {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a,b,c = 0;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		int secondBiggestNum = 0;
		
		if(a > b) { 
			secondBiggestNum = b;
		} else {
			secondBiggestNum = a;
		}
		
		if(secondBiggestNum < c) {
			secondBiggestNum = c;
		}
		
		System.out.println(secondBiggestNum);
		
	}

}
/*

문제
세 정수 A, B, C가 주어진다. 이때, 두 번째로 큰 정수를 출력하는 프로그램을 작성하시오. 

입력
첫째 줄에 세 정수 A, B, C가 공백으로 구분되어 주어진다. (1 ≤ A, B, C ≤ 100)

출력
두 번째로 큰 정수를 출력한다.
*/