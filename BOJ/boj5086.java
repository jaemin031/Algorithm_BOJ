import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int a = 10001,b =10001;
		StringTokenizer stk;
		while(true) {
			stk = new StringTokenizer(br.readLine());
			a = Integer.parseInt(stk.nextToken());
			b = Integer.parseInt(stk.nextToken());
			if(a==0&&b==0)
				break;
			else {
				if(b%a == 0)
					bw.write("factor\n");
				else if(a%b == 0)
					bw.write("multiple\n");
				else
					bw.write("neither\n");
			}
		}
		
		bw.flush();
		bw.close();
		br.close();
	}

	
}
