import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	static int[][] square = new int[101][101];
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		for(int i=1;i<=n;i++) {
			String[] st = br.readLine().split(" ");
			int Start_X = Integer.parseInt(st[0]);
			int Start_Y = Integer.parseInt(st[1]);
			int width = Integer.parseInt(st[2]);
			int height = Integer.parseInt(st[3]);
			coloring(Start_X, Start_Y, width, height, i);
		}
		for(int i=1;i<=n;i++) {
			System.out.println(Calc(i));
		}
		br.close();
	}
	
	static void coloring(int Start_X, int Start_Y, int width, int height, int color) {
		for(int i=Start_X;i<Start_X+width;i++) {
			for(int j=Start_Y;j<Start_Y+height;j++) {
				square[i][j] = color;
			}
		}
	}
	
	static int Calc(int color){
		int result = 0;
		
		for(int i=0;i<101;i++) {
			for(int j=0;j<101;j++) {
				if(square[i][j]==color) {
					result++;
				}
			}
		}
		return result;
	}
}



