import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] check = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		int result = 0;
		
		try {
			String input = br.readLine().trim();
			for(int i = 0; i<check.length;i++) {
				if(input.contains(check[i])) {
					input = input.replaceAll(check[i], "@");
				}
			}
			
			result = input.length();
			bw.write(result + "");
			bw.flush();
			br.close();
			bw.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	
	}
}
