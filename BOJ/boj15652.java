import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
 
public class Main {
	
	static int N;
	static int M;
	static int[] ary;
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        
        try {
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	N = Integer.parseInt(st.nextToken());		// 1 ~ N
        	M = Integer.parseInt(st.nextToken());		// M개를 고른다.
        	
        	
        	ary = new int[N];
        	
        	dfs(0);
        	
    		br.close();
    	} catch (IOException e) {
    		e.printStackTrace();
    	}
    }
    
    static void dfs(int count) {
	    	if(count==M) {
	    		try {
		    		for(int i=0; i<M; i++) {
		    			bw.write(Integer.toString(ary[i]) + " ");
		    		}
			    	bw.write("\n");
					bw.flush();
					return;
				} catch (IOException e) {
					e.printStackTrace();
				}
	    	}
	    	for(int i = 1;i<=N;i++) {
	    		if(count!=0&&ary[count-1]>i)
	    			continue;
	    		ary[count] = i;
	    		dfs(count+1);
	    	}
	    	
	    	
    }
    
}

