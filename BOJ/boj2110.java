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
    	
    	String[] st1 = br.readLine().split(" ");

    	int N = Integer.parseInt(st1[0]);
    	int C = Integer.parseInt(st1[1]);
    	arr = new int[N];
    	
    	for(int i=0;i<N;i++) {
    		arr[i] = Integer.parseInt(br.readLine());
    	}
    	Arrays.sort(arr);

    	int min = 1;
    	int middle = 0;
    	int max = arr[arr.length-1] - arr[0];
    	int d = 0;
    	int result = 0;
    	
    	while(max>=min) {
    		middle = (min+max)/2;
    		int start = arr[0];
    		int count = 1;
    		
    		
    		for(int i=0;i<N;i++) {
    			d = arr[i] - start;
    			if(middle <= d) {
    				count++;
    				start = arr[i];
    			}
    		}
    			
    		
    		
    		if(count >= C) {
    			result = middle;
    			min = middle + 1;
    		}else if(count < C) {
    			max = middle - 1;
    		}
    		
    	}

    	bw.write(result + "\n");
    	bw.flush();
    }
    
    
    
    
}
