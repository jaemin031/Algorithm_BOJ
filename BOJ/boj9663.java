import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
 
public class Main {
	
	static int N;
	static int[] check;
	static int totalCnt=0;
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        try {
        	N = Integer.parseInt(br.readLine());
        	check = new int[N];
        	Arrays.fill(check, -1);
        	
        	nQueen(0);

        	bw.write(String.valueOf(totalCnt));
        	bw.flush();
    		br.close();
    	} catch (IOException e) {
    		e.printStackTrace();
    	}
    }
    
    public static void nQueen(int cnt) {
    	
    	if(cnt==N) {
    		totalCnt++;
    		return;
    	}
    	
    	boolean[] able = new boolean[N];
    	
    	for(int i=0;i<cnt;i++) {
    		int t = check[i];
    		able[t] = true;
    		if(t+cnt-i<N)
    			able[t+cnt-i] = true;
    		if(t-cnt+i>=0)
    			able[t-cnt+i] = true;
    	}
    	
    	for(int i=0;i<N;i++) {
    		if(!able[i]) {
    			check[cnt] = i;
    			nQueen(cnt+1);
    			check[cnt] = -1;
    		}
    	}
    	
    }
}
