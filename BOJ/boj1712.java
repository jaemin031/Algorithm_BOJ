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
			String[] st = new String[2];
			st = br.readLine().trim().split(" ");
			long A = Long.parseLong(st[0]);
			long B = Long.parseLong(st[1]);
			long C = Long.parseLong(st[2]);
			

			if((C - B) > 0) {
	            bw.write(((A / (C - B)) + 1) + "\n");
	        } else {
	            bw.write("-1\n");
	        }
			bw.flush();
			br.close();
			bw.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	
	}
}
