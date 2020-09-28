import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.PriorityQueue;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		int[] T = new int[N+6];		// 기간
		int[] P = new int[N+6];		// 금액
		int[] dp = new int[N+6];	// 딥
		int payMax = 0;
		
		String[] st;
		for(int i=1;i<=N;i++) {
			st = br.readLine().split(" ");
			T[i] = Integer.parseInt(st[0]);
			P[i] = Integer.parseInt(st[1]);
		}

		for(int i=1;i<=N+1;i++) {
			dp[i] = Math.max(dp[i],payMax);
			dp[T[i]+i] = Math.max(dp[T[i]+i], P[i]+dp[i]);
			payMax = Math.max(dp[i],payMax);
		}
		
		
		bw.write(String.valueOf(payMax));
		bw.flush();
		bw.close();
		br.close();
		
	}
	
}
