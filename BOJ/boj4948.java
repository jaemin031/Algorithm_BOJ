import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = 1;
        int count = 0;
        try {
        	while(true) {
        		n = Integer.parseInt(br.readLine());
        		if(n==0)
        			break;
        		count = 0;
        		for(int i=n+1;i<=2*n;i++) {
        			if(isPrime(i))
        				count++;
        		}
        		bw.write(Integer.toString(count)+'\n');
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
