import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int i = Integer.parseInt(br.readLine());
		
		while(i!=1) {
			for(int j = 2;j<=i;j++) {
				if(i%j==0) {
					i/=j;
					bw.write(j+"\n");
					break;
				}
					
			}
				
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
	
}
