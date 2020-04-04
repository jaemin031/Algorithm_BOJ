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
    	
    	String[] st = br.readLine().split(" ");
    	int K = Integer.parseInt(st[0]);
    	int N = Integer.parseInt(st[1]);
    	arr = new int[K];
    	long min = 1;
    	long middle = 0;
    	long max;
    	
    	for(int i=0;i<K;i++) {
    		arr[i] = Integer.parseInt(br.readLine());
    	}
    	Arrays.sort(arr);
    	max = arr[arr.length-1];
    	
    	while(max>=min) {
    		middle = (min+max)/2;
    		
    		long count = 0;
    		
    		for(int i=0; i<K;i++)
    			count += arr[i]/middle;
    		
    		if(count >= N) {
    			min = middle + 1;
    		}else if(count < N) {
    			max = middle - 1;
    		}
    		
    	}

    	bw.write(max + "\n");
    	bw.flush();
    }
    
    
    
    
}
