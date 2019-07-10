import java.io.IOException;
import java.util.Scanner;

public class Addition {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		int a,b,c = 0;
		a = sc.nextInt();
		b = sc.nextInt();
		c = a + b;
		System.out.println(c);
		
		
	}
}
