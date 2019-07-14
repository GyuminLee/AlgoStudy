import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class QuickSum {
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));//선언

		
		int inputNum = Integer.parseInt(bf.readLine());
		
		for(int i = 0; i < inputNum; i++) {
			String s = bf.readLine(); //String
			int a = Integer.parseInt(s.split(" ")[0]);
			int b = Integer.parseInt(s.split(" ")[1]);

			bw.write(a+b+"\n");
		}
		
		bw.flush();
		bw.close();
	}
}
