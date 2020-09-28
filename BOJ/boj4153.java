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
        
        int line[] = new int[3];
        
        int xx,yy;
        
        try {
        	
        	while(true) {
        		StringTokenizer st = new StringTokenizer(br.readLine());
        		line[0] = Integer.parseInt(st.nextToken());
        		line[1] = Integer.parseInt(st.nextToken());
        		line[2] = Integer.parseInt(st.nextToken());
        		
        		if(line[0]==0&&line[1]==0&&line[2]==0) 
        			break;

        		if(line[2]<line[0] && line[1]<line[0]) {
        			if(((line[1]*line[1]) + (line[2]*line[2]))==(line[0]*line[0])) {
        				bw.write("right\n");
        			}else {
        				bw.write("wrong\n");
        			}
        		}else if(line[0]<line[1] && line[2]<line[1]) {
        			if(((line[0]*line[0]) + (line[2]*line[2]))==(line[1]*line[1])) {
        				bw.write("right\n");
        			}else {
        				bw.write("wrong\n");
        			}
        		}else {
        			if(((line[1]*line[1]) + (line[0]*line[0]))==(line[2]*line[2])) {
        				bw.write("right\n");
        			}else {
        				bw.write("wrong\n");
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
	
}
