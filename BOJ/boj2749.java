import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static int m = 1000000;
	static int pp = m/10*15;
	static int[] fivo;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		long n = Long.parseLong(br.readLine());
		fivo = new int[pp];
		fivo[0] = 0;
		fivo[1] = 1;
		for(int i=2; i<pp; i++) {
			fivo[i] = fivo[i-2] + fivo[i-1];
			fivo[i]%=m;
		}
		
		bw.write(fivo[(int)(n%(long)pp)]+"\n");
		
		bw.flush();
		bw.close();
		br.close();
	
	}

}
