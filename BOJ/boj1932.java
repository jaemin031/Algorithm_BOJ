import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	
	static int[][] number;
	static int maxNumber = Integer.MIN_VALUE;
	public static void main(String[] args)   {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			int n = Integer.parseInt(br.readLine());
			number = new int[n][n];
			StringTokenizer stk;
			
			for(int i=0;i<n;i++) {
				stk = new StringTokenizer(br.readLine());
				for(int j=0; j<i+1;j++) {
					number[i][j] = Integer.parseInt(stk.nextToken());
				
				}
				for(int j=0;j<i+1;j++) {
					if(i!=0) {
						if(j!=0)
							number[i][j] += Math.max(number[i-1][j],number[i-1][j-1]);
						else
							number[i][j] += number[i-1][j];
					}
				}
			}
			
			
			for(int i=0;i<n;i++)
				if(maxNumber<number[n-1][i])
					maxNumber=number[n-1][i];
			
			System.out.println(maxNumber);
		
			br.close();
		
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	
}
