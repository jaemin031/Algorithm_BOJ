import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static int N,M,B;
	static int[][] map;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] st = br.readLine().split(" ");
		
		N = Integer.parseInt(st[0]);
		M = Integer.parseInt(st[1]);
		B = Integer.parseInt(st[2]);
		map = new int[N][M];
		int minDp = Integer.MAX_VALUE;
		int maxDp = Integer.MIN_VALUE;
		
		for(int i=0;i<N;i++) {
			String[] st2 = br.readLine().split(" ");
			for(int j=0;j<M;j++) {
				map[i][j] = Integer.parseInt(st2[j]);
			}
		}
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				if(minDp>map[i][j]) {
					minDp = map[i][j];
				}
				if(maxDp<map[i][j]) {
					maxDp = map[i][j];
				}
			}
		}
		
		int[] result = new int[2];
		result = cals(minDp,maxDp);
		bw.write(result[0] + " " + result[1] + "\n");
		bw.flush();
		bw.close();
		br.close();
	}
	static int[] cals(int min, int max) {
		int[] ans = new int[2];
		
		int time = Integer.MAX_VALUE;
		int maxDeep = 0;
		
		for(int i=min;i<=max;i++) {
			int time2 = 0;
			int[][] mp = map;
			int inven = B;
			for(int j=0;j<N;j++) {
				for(int k=0;k<M;k++) {
					if(mp[j][k] == i) {
						continue;
					}else if(mp[j][k]<i) {		// 땅이 높이보다 작을때
						inven -= i - mp[j][k];
						time2 += (i - mp[j][k]);
					}else if(mp[j][k]>i) {		// 땅이 높이보다 클 때
						inven += mp[j][k]-i;
						time2 += (mp[j][k]-i)*2;
					}
				
				}
			}
			if(inven>=0&&time>=time2) {
				time = time2;
				maxDeep = i;
			}
		}
		
		ans[0] = time;
		ans[1] = maxDeep;
		
		return ans;
	}
}



