import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
 
public class Main {
	
	static String[] ll;
	
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        
        try {
        	int T = Integer.parseInt(br.readLine());
        	
        	ll = new String[T];
        	
        	for(int i = 0 ; i <T;i++) {
        		ll[i] = br.readLine();
        	}
        	
        	Arrays.sort(ll,new Comparator<String>() {

				@Override
				public int compare(String arg0, String arg1) {
					return Integer.compare(arg0.length(), arg1.length());
				}
        		
        	});
        	
        	
        	int j,dst1,dst2;
        	for(int i = 0; i<T;i++) {
        		dst1 = ll[i].length();
        		
        		for(j = i+1; j<T;j++) {
        			dst2 = ll[j].length();
        			
        			if(dst1 != dst2)
        				break;
        		}
        		Arrays.sort(ll,i,j);
        		i = j - 1;
        		
        	}
        	
        	
        	bw.write(ll[0]+"\n");
        	for(int i = 1 ; i<T;i++){
        		if(ll[i-1].equals(ll[i]))
        			continue;
        		bw.write(ll[i] + "\n");
        	}
        	
    		bw.flush();
    		bw.close();
    		br.close();
    	} catch (IOException e) {
    		e.printStackTrace();
    	}
    }
}
