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
		try {
			st = new StringTokenizer(br.readLine());
			long A = Long.parseLong(st.nextToken());
	        long B = Long.parseLong(st.nextToken());
	        long V = Long.parseLong(st.nextToken());
	        long ans = 1 + (((V-A)%(A-B) == 0 ? (V-A)/(A-B) : ((V-A)/(A-B)) + 1));
	        bw.write(ans + "\n");
			bw.flush();
			br.close();
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
