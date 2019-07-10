import java.util.Scanner;

public class Multiply {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		int three = b % 10;
		int four = (b % 100) / 10;
		int five = b / 100;
		
		System.out.println(three * a);
		System.out.println(four * a);
		System.out.println(five * a);
		System.out.println(a * b);
		
	}
}
