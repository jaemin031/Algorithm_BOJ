import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	static int array[];
	
	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		

		try {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			int sum = 0;
			int v = 0;
			
			array = new int[N];
			st = new StringTokenizer(br.readLine());

			for(int i = 0; i<N;i++)
				array[i] = Integer.parseInt(st.nextToken());
			
			
			for(int i = 0; i<N;i++) {
				for(int j = i+1; j<N; j++) {
					for(int k = j+1; k<N; k++) {
						v = array[i]+array[j]+array[k];
						
						if(v<=M&&(M-sum)>(M-v))
							sum = v;
					}
				}
			}
			
			bw.write(sum +"\n");
			
			
			bw.flush();
			bw.close();
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
}
