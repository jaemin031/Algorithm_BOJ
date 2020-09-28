import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	
	static int max = 0;
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
        int[] arr = new int[n];
        int[] dp = new int[n];
        
        StringTokenizer stk = new StringTokenizer(br.readLine());
        
        for(int i=0;i<n;i++)
        	arr[i] = Integer.parseInt(stk.nextToken());
        
        
        dp[0] = 1;
        
        for(int i=1;i<n;i++) {
        	dp[i]=1;
        	for(int j = 0;j<i;j++) {
        		if(arr[i]>arr[j]&&dp[i]<=dp[j])
        			dp[i] = dp[j]+1;
        		else if(arr[i] == arr[j])
        			dp[i] = dp[j];
        	}
        	
        }
        	
        for(int i =0;i<n;i++)
        	max = Math.max(max, dp[i]);
        
        bw.write(max+"\n");
        bw.flush();
        bw.close();
        br.close();
	}

	
}
