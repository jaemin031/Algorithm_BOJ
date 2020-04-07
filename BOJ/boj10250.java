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
		int H,W,N;
		int frontNumber=0;
		int endNumber=0;
        try {
			T = Integer.parseInt(br.readLine());
			
			for(int i=0; i<T;i++) {
				st = new StringTokenizer(br.readLine());
				H = Integer.parseInt(st.nextToken());
				W = Integer.parseInt(st.nextToken());
				N = Integer.parseInt(st.nextToken());
				if(N%H==0) {
					frontNumber=H;
					endNumber = N/H;
				}else {
					frontNumber=N%H;
					endNumber = (N/H)+1;
				}
				frontNumber *=100;
				
				bw.write(Integer.toString(frontNumber+endNumber)+'\n');
				
			}
	        
			bw.flush();
			br.close();
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
