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
		String[] st = br.readLine().split(" ");
		int[] P = new int[st.length+1];
		int[] dp = new int[st.length+1];
		
		for(int i=1;i<st.length+1;i++)
			P[i] = Integer.parseInt(st[i-1]);
		
		for(int i=1;i<=N;i++) {
			for(int j=1;j<=i;j++) {
				dp[i] = Math.max(dp[i],dp[i-j] + P[j]);
			}
		}
		
		bw.write(String.valueOf(dp[N]));
		bw.flush();
		bw.close();
		br.close();
		
	}
	
}
