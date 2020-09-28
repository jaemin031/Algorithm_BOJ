import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			int i = Integer.parseInt(br.readLine());
			int count = 0;
			
			for(;;i=i-3) {
				if(i%5 == 0) {
					bw.write(i/5 + count +"");
					break;
				}else if(i<=0) {
					bw.write("-1");
					break;
				}
				count++;
			}
			
			bw.flush();
			br.close();
			bw.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	
	}
}
