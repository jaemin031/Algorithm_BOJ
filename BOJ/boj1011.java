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
        StringTokenizer st;
		int T = 0;
		int x,y;
		
		
        try {
			T = Integer.parseInt(br.readLine());
			
			for(int i=0; i<T;i++) {
				st = new StringTokenizer(br.readLine());
				x = Integer.parseInt(st.nextToken());
				y = Integer.parseInt(st.nextToken());
				int move = 0;
				int count = 0;
				
				while(true) {
					move++;
					x += move;
					count++;
					
					if(x>=y) {
						break;
					}
					
					y -= move;
					count++;
					if(y <=x) {
						break;
					}
					
				}
				bw.write(Integer.toString(count) + '\n');
				
			}
	        
			bw.flush();
			br.close();
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
