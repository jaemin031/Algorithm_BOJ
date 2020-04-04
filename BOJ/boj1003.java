import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args)   {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			int T = Integer.parseInt(br.readLine());
			int[][] count = new int[2][41];			//count[0][] = zero, count[1][] = one
			count[0][0] = 1;
			count[1][0] = 0;
			count[0][1] = 0;
			count[1][1] = 1;
			
			for(int i=2;i<41;i++) {
				count[0][i] = count[0][i-1] + count[0][i-2];
				count[1][i] = count[1][i-1] + count[1][i-2];
			}
			
			
			for(int j=0;j<T;j++) {
				int n = Integer.parseInt(br.readLine());
				bw.write(Integer.valueOf(count[0][n]) + " " + Integer.valueOf(count[1][n]) + "\n");
			}
			
		
		
			bw.flush();
			bw.close();
			br.close();
		
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
	
	
}
