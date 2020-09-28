import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
 
public class Main {
	
	static int[] ary;
	static boolean[] visit;
	static int N,M;
	static StringBuilder sb;
	public static void dfs(int count) {
	
		if(count == M) {
			sb = new StringBuilder();
			for(int i = 0 ;i<M;i++) {
				sb.append(ary[i]+" ");
			}
			sb.append("\n");
			System.out.print(sb);
			return;
		}
		
		for(int i = 1; i<=N; i++) {
			
			if(visit[i])
				continue;
			visit[i]=true;
			ary[count]=i;
			dfs(count+1);
			visit[i]=false;
			
		}
		
	}
	
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        
        try {
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	N = Integer.parseInt(st.nextToken());		// 1 ~ N
        	M = Integer.parseInt(st.nextToken());		// M개를 고른다.
        	
        	ary = new int[M];
        	visit = new boolean[N+1];
        	
        	
        	dfs(0);
        	
        	
    		br.close();
    	} catch (IOException e) {
    		e.printStackTrace();
    	}
    }
}
