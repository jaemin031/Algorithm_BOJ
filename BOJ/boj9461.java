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
			int[] testNumber = new int[T];
			int maxNumber = Integer.MIN_VALUE;
			
			for(int i=0;i<T;i++) {
				testNumber[i] = Integer.parseInt(br.readLine());
				if(testNumber[i]>maxNumber)
					maxNumber = testNumber[i];
			}
			long[] triple = new long[maxNumber+1];
			triple[1] = 1;
			triple[2] = 1;
			triple[3] = 1;
			
			for(int i=4;i<=maxNumber;i++)
				triple[i] = triple[i-2] + triple[i-3];
			
			for(int i=0;i<T;i++)
				bw.write(triple[testNumber[i]]+"\n");
				
				
		
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
