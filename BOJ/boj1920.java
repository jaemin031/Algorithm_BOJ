import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
public class Main {
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    	int N = Integer.parseInt(br.readLine());
    	String[] sta = br.readLine().split(" ");
    	int[] A = new int[N]; 
    	for(int i=0;i<N;i++)
    		A[i] = Integer.parseInt(sta[i]);
    	
    	int M = Integer.parseInt(br.readLine());
    	String[] stb = br.readLine().split(" ");
    	int[] B = new int[M];
    	for(int i=0;i<M;i++)
    		B[i] = Integer.parseInt(stb[i]);

    	int[] result = running(A,B);
    	for(int i=0;i<result.length;i++)
    		bw.write(result[i] + "\n");
    	
    	bw.flush();
    
    }
    
    static int[] running(int[] a, int[] b) {
    	int[] result = new int[b.length];
    	int[] aa = a;
    	int[] bb = b;
    	Arrays.sort(aa);
    	
    	for(int i=0;i<bb.length;i++) {
    		int flag = 0;
    		
    		int max = aa.length;
    		int min = -1;
    		int middle;
    		
    		while(max - min >1) {
    			middle = (min+max)/2;
    			
    			if(bb[i] == aa[middle]) {
    				flag = 1;
    				break;
    			}
    			
    			if(bb[i] > aa[middle]) {
    				min = middle;
    			}else if(bb[i]<aa[middle]) {
    				max = middle;
    			}
    		}
    		result[i] = flag;
    	}
    	return result;
    }

}
