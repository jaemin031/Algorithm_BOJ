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
		int m,n;
		int sum=0;
		int min = -1;
		
        try {
        	m = Integer.parseInt(br.readLine());
        	n = Integer.parseInt(br.readLine());
        	for(n=n; m<=n ;n--) {
        		if(n==1)
        			continue;
        		if(isPrime(n)) {
        			sum+=n;
        			min=n;
        		}
        		
        	}
        	
        	if(min!=-1) {
        		bw.write(Integer.toString(sum)+'\n');
        	}
        	bw.write(Integer.toString(min)+'\n');
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
