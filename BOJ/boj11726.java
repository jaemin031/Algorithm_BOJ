import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int dp[] = new int[1003];
		int n = Integer.parseInt(br.readLine());
		dp[0] = 0;
		dp[1] = 1;
		dp[2] = 2;
		
		for(int i=3;i<=n;i++) {
			dp[i] = (dp[i-1]+dp[i-2])%10007;
		}
		bw.write(String.valueOf(dp[n])+ "\n");
		
		bw.flush();
		bw.close();
		br.close();
	}
	
}
