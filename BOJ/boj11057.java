import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
	static int count = 0;
	static int[][] ary;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		ary = new int[N+1][10];
		
		Arrays.fill(ary[1], 1);
		
		for(int i = 1 ; i<N+1; i++) {
			ary[i][0] = 1;
		}
		
		for(int i = 2; i<N+1;i++) {
			for(int j = 1; j<10; j++) {
				ary[i][j] = (ary[i-1][j] + ary[i][j-1])%10007;
			}
		}
		
		for(int i=0;i<10;i++) {
			count += ary[N][i];
		}
		bw.write(Integer.toString(count%10007));
		bw.flush();
		bw.close();
		br.close();
	}
}
