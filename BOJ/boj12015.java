import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Main {
	static int[] arr;
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	

    	int N = Integer.parseInt(br.readLine());
    	
    	String[] st = br.readLine().split(" ");
    	int[] nums = new int[N];
    	int[] dp = new int[N];
    	Arrays.fill(dp, 1000001);
    	for(int i=0;i<N;i++)
    		nums[i] = Integer.parseInt(st[i]);
    	
    	int count = 0;
    	
    	for(int i = 0; i<N; i++) {
    		int num = nums[i];
    		
    		if(dp[count] < num) {
    			dp[++count] = num;
    		}else if(dp[count] > num) {
    			int left = 0;
    			int right = count;
    			int mid;
    			
    			while(left < right) {
    				mid = (left + right) / 2 ;
    				
    				if(dp[mid] < num) {
    					left = mid + 1;
    				}else
    					right = mid;
    				
    			}
    			dp[right] = num;
    			
    		}
    		
    	}
    	
    	
    	bw.write(count+1 + "\n");
    	bw.flush();
    }
    
    
    
    
}
