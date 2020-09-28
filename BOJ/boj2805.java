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
    	String[] st2 = br.readLine().split(" ");
    	int N = Integer.parseInt(st1[0]);
    	int M = Integer.parseInt(st1[1]);
    	arr = new int[N];
    	for(int i=0;i<N;i++) {
    		arr[i] = Integer.parseInt(st2[i]);
    	}
    	Arrays.sort(arr);

    	long min = 1;
    	long middle = 0;
    	long max;
    	
    	
    	max = arr[arr.length-1];
    	
    	while(max>=min) {
    		middle = (min+max)/2;
    		
    		long mitter = 0;
    		
    		for(int i=0; i<N;i++) {
    			if(arr[i]>middle)
    				mitter += arr[i] - middle;
    		}
    		
    		if(mitter >= M) {
    			min = middle + 1;
    		}else if(mitter < M) {
    			max = middle - 1;
    		}
    		
    	}

    	bw.write(max + "\n");
    	bw.flush();
    }
    
    
    
    
}
