import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	
	static int max = Integer.MIN_VALUE;
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int count = Integer.parseInt(br.readLine());
		List<String> list = new LinkedList<>();
		int a0	=	0;
		
		StringTokenizer stk = new StringTokenizer(br.readLine());
		for(int i=0;i<count;i++) {
			if(i==0)
				a0 = Integer.parseInt(stk.nextToken());
			else {
				int b = Integer.parseInt(stk.nextToken());
				int gcd = getGCD(Math.max(a0, b), Math.min(a0, b));
				list.add((a0/gcd)+"/"+(b/gcd));
			}
				
		
		}
		
		for(int i=0;i<list.size();i++)
			bw.write(list.get(i)+"\n");
		
		
		bw.flush();
		bw.close();
		br.close();
	}
	
	public static int getGCD(int a, int b) {
        if(b == 0) return 0;
        
        while(b > 0) {
            int tmp = a;
            a = b;
            b = tmp%b;
        }
        return a;
    }
	
}
