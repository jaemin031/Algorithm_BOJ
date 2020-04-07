import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.PriorityQueue;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] result = new String[10];
		String st = br.readLine();
		int length = st.length();
		
		for(int i=0;i<=length/10;i++) {
			if((i*10)+10 <= length)
				result[i] = st.substring(i*10,(i*10)+10);
			else
				result[i] = st.substring(i*10,length);
		}

		for(int i=0;i<=length/10;i++)
			bw.write(String.valueOf(result[i])+"\n");
		
		bw.flush();
		bw.close();
		br.close();
		
	}
	
}
