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
       
        
        try {
        	 StringTokenizer st = new StringTokenizer(br.readLine());
        	 int M = Integer.parseInt(st.nextToken());
        	 int N = Integer.parseInt(st.nextToken());
        	 
        	 for(int i = M; i<=N;i++) {
        		 
        		 if(isPrime(i)&&i!=1)
        			 bw.write(i+ "\n");
        		 
        	 }
        	
        	
        	
			bw.flush();
			br.close();
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static boolean isPrime(int n) {
			boolean flag = true;
			int end = (int)Math.sqrt(n);
	
			for(int j=2; j<=end; j++) {
				if(n%j==0) {
					flag = false;
					break;
				}
			}
			
			
			return flag;
	}
}
	

