import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int T = 0;
        int n = 0;
        int min = 0;
        int max = 0;
        
        try {
        	T = Integer.parseInt(br.readLine());
        	
        	for(int roop =0;roop<T;roop++) {
        		n = Integer.parseInt(br.readLine());
        		
        		for(min=n/2,max=n/2;;max++,min--) {
        			n=min+max;
        			if(isPrime(min)&&isPrime(max)) {
        				bw.write(Integer.toString(min)+" "+Integer.toString(max)+'\n');
        				break;
        			}
        		}
        		
        		
        		
        	}
        	
			bw.flush();
			br.close();
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	 public static boolean isPrime(int num) {
	        boolean result = true;
	        int end = (int)Math.sqrt(num);
	        for(int i = 2; i <= end; i++) {
	            if( num%i == 0) {
	                result = false;
	                break; 
	            } else {
	                result = true;
	            }
	        }        
	        return result;        
	    }
}
