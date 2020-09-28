import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	
	static int max = Integer.MIN_VALUE;
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
        int[] arr = new int[n];
        int[] dp = new int[n];
        
        StringTokenizer stk = new StringTokenizer(br.readLine());
        
        for(int i=0;i<n;i++)
        	arr[i] = Integer.parseInt(stk.nextToken());
        
        
        if(n>=1)
        	dp[0] = arr[0];
        if(n>=2)
        	dp[1] = Math.max(dp[0]+arr[1], arr[1]);
        
        for(int i=2;i<n;i++) {
        	dp[i] = Math.max(dp[i-1]+arr[i], arr[i]);
        }
        for(int i=0;i<n;i++)
        	max = Math.max(max, dp[i]);
        	
        bw.write(max+"\n");
        bw.flush();
        bw.close();
        br.close();
	}

	
}
