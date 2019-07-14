import java.util.Scanner;

public class AB3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int inputNum = sc.nextInt();
		
		for(int i = 0; i < inputNum; i++) {
		
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(a + b);
		}
		
	}
}
