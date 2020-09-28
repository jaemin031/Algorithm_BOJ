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
    	int K = Integer.parseInt(br.readLine());
    	

    	int left = 1;
    	int right = K;
    	int result = 0;
    	
    	while(left<=right) {
    		int mid = (left+right)/2;
    		int count = cntCount(mid,N);
    		
    		if(count>=K) {
    			result = mid;
    			right = mid-1;
    		}else {
    			left = mid + 1;
    		}
    	
    	}
    	
    	bw.write(result + "\n");
    	bw.flush();
    }
    
    public static int cntCount(int mid, int n) {
    	int cnt = 0;
    	for(int i=1;i<=n;i++)
    		cnt += Math.min(mid/i, n);
    	
    	return cnt;
    }
    
    
    
}
