import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] st = br.readLine().split(" ");
		int A = Integer.parseInt(st[0]);
		int i = Integer.parseInt(st[1]);
		int r;
		
		r = (i-1)*A;
		r +=1;
		
		bw.write(Integer.toString(r));
		bw.flush();
		bw.close();
		br.close();
	}
	
	
	
}
