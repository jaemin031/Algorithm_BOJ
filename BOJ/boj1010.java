import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int testcase = Integer.parseInt(br.readLine());
		int[][] dp;
		while(testcase-->0) {
			String[] st = br.readLine().split(" ");
			int N = Integer.parseInt(st[0]);
			int M = Integer.parseInt(st[1]);
			dp = new int[N+1][M+1];
			for(int i = 0; i <= M; i++)
				dp[1][i] = i;
			
			for(int i = 2; i <= N; i++) {
				for(int j = i; j <= M; j++) {
					for(int k = j; k >= i; k--) {
						dp[i][j] += dp[i-1][k-1]; 
					}
				}
			}
			
			bw.write(String.valueOf(dp[N][M]) + "\n");
		}
		
		
		bw.flush();
		bw.close();
		br.close();
	}
	
}
