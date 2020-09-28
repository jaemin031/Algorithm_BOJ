import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	static int N;
	static int[][]  mat;
	static Queue<Integer> que = new LinkedList<>();
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		N = Integer.parseInt(br.readLine());
		
		String[] st1;
		mat = new int[N][N];
			
		for(int i=0; i<N;i++) {
			st1 = br.readLine().split(" ");
			for(int j=0;j<N;j++) {
				mat[i][j] = Integer.parseInt(st1[j]);
			}
		}
		int num;
		for(int i=0; i<N; i++) {
			for(int j=0;j<N;j++) {
				if(mat[i][j] == 1)
					que.add(j);
			}
			while(!que.isEmpty()) {
				num = que.poll();
				bfs(i,num);
			}
		}
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				bw.write(mat[i][j] + " ");
			}
			bw.write("\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
	
	static void bfs(int line, int num) {
		mat[line][num] = 1;
		
		for(int i=0;i<N;i++)
			if(mat[num][i]==1&&mat[line][i]!=1)
				que.add(i);
			
	}
	
}
