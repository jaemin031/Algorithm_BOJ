import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int testCase = Integer.parseInt(br.readLine());
		int[][] post;
		int[][] dp;
		while(testCase-->0) {
			int jj = Integer.parseInt(br.readLine());
			post = new int[2][jj+1];
			dp = new int[2][jj+1];
			String[] st;
			
			for(int i=0;i<2;i++) {
				st = br.readLine().split(" ");
				for(int j=1;j<=jj;j++) {
					post[i][j] = Integer.parseInt(st[j-1]);
				}
			}
			
			
			bw.write(play(post,dp) + "\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
	
	public static int play(int[][] post,int[][] dp) {
		int result = 0;
		dp[0][1] = post[0][1];
		dp[1][1] = post[1][1];
		int n = dp[0].length-1;
		for(int i=2;i<=n;i++) {
			dp[0][i] = Math.max(dp[1][i-1],dp[1][i-2]) + post[0][i];
			dp[1][i] = Math.max(dp[0][i-1],dp[0][i-2]) + post[1][i];
		}
		result = Math.max(dp[0][n], dp[1][n]);
		
		return result;
		
	}
	
	
}
