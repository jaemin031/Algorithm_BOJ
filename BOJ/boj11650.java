import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;
 
public class Main {
	
	static int[][] ll;
	
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        
        try {
        	int T = Integer.parseInt(br.readLine());
        	StringTokenizer st;
        	ll = new int[T][2];
        	
        	for(int i = 0 ; i <T;i++) {
        		st = new StringTokenizer(br.readLine());
        		ll[i][0] = Integer.parseInt(st.nextToken());
        		ll[i][1] = Integer.parseInt(st.nextToken());
        	}

        	
        	Arrays.sort(ll,new Comparator<int[]>() {

				@Override
				public int compare(int[] arg0, int[] arg1) {
					if(arg0[0] == arg1[0]) {
						return Integer.compare(arg0[1],arg1[1]);
					}else
						return Integer.compare(arg0[0], arg1[0]);
				}
        		
        	});
        	

        	
        	
        	for(int i = 0 ; i<T;i++)
        		bw.write(ll[i][0] + " " + ll[i][1] + "\n");
        	
        	
    		bw.flush();
    		bw.close();
    		br.close();
    	} catch (IOException e) {
    		e.printStackTrace();
    	}
    }
}
