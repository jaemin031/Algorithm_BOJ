import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	
	static int[][] value;
	
	public static void main(String[] args)   {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			int house = Integer.parseInt(br.readLine());
			value = new int[house][3];
			StringTokenizer stk;
			
			for(int i = 0;i<house;i++) {
				stk = new StringTokenizer(br.readLine());
				for(int j=0;j<3;j++) {
					value[i][j] = Integer.parseInt(stk.nextToken());
				}
				if(i!=0) {
					value[i][0] += Math.min(value[i-1][1], value[i-1][2]);
					value[i][1] += Math.min(value[i-1][0], value[i-1][2]);
					value[i][2] += Math.min(value[i-1][0], value[i-1][1]);
				}
			}
			System.out.println(Math.min(value[house-1][0], Math.min(value[house-1][1], value[house-1][2])));
			
			
				
		
			br.close();
		
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	
}
