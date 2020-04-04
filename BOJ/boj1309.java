import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static int count = 0;
	static int[] dp;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		dp = new int[N+1];
		dp[0] = 1;
		dp[1] = 3;
		
		for(int i=2;i<=N;i++)
			dp[i] = (dp[i-1]*2  + dp[i-2])%9901;
		
		
		bw.write(Integer.toString(dp[N]));
		bw.flush();
		bw.close();
		br.close();
	}
}

