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
        
        int x[] = new int[3];
        int y[] = new int[3];
        
        int xx,yy;
        
        try {
        	for(int i=0;i<3;i++) {
        		StringTokenizer st = new StringTokenizer(br.readLine());
        		x[i] = Integer.parseInt(st.nextToken());
        		y[i] = Integer.parseInt(st.nextToken());
        	}
        	
        	if(x[0]==x[1]) {
        		xx=x[2];
        	}else if(x[1]==x[2]){
        		xx=x[0];
        	}else {
        		xx=x[1];
        	}
        	
        	if(y[0]==y[1]) {
        		yy=y[2];
        	}else if(y[1]==y[2]){
        		yy=y[0];
        	}else {
        		yy=y[1];
        	}
        	bw.write(Integer.toString(xx)+" "+Integer.toString(yy)+'\n');
        	
        	
			bw.flush();
			br.close();
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
