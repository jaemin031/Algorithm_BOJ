import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] st = br.readLine().split(" ");
		int N = Integer.parseInt(st[0]);
		int M = Integer.parseInt(st[1]);
		
		char[][] mat = new char[N][M];
		boolean[][] pick = new boolean[N][M];
		for(int i=0;i<N;i++) {
			String st1 = br.readLine();
			for(int j=0;j<M;j++) {
				mat[i][j] = st1.charAt(j);
				pick[i][j] = false;
			}
		}
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				if(((i == 0) || (mat[i][j]==mat[i-1][j])) && ((i == N-1) || (mat[i][j]==mat[i+1][j])) && ((j == 0) || (mat[i][j]==mat[i][j-1])) && ((j == M-1) || (mat[i][j]==mat[i][j+1]))) {
					pick[i][j] = true;
				}
			}
		}
		
		int count = 0;
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				if(pick[i][j])
					count++;
			}
		}
		System.out.println(pow(count));
		
		
    	bw.flush();
    }
	

	public static long pow(int x) {  // 2의 x승 구하는 함수

		if (x == 0) return 1; 

		if (x == 1) return 2;



		long value = pow(x / 2);

		if (x % 2 == 0) {

			return (value * value) % 1000000007; // 2^2x = 2^x * 2^x

		}

		else {

			return (((value * value) % 1000000007) * 2) % 1000000007; // 2^(2x + 1) = 2^x * 2^x * 2

		}

	}
    
}
