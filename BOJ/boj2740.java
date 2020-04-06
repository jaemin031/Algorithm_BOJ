import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.Deque;
import java.util.LinkedList;
public class Main {
	static StringBuilder stb = new StringBuilder();
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    	String[] st = br.readLine().split(" ");
    	int N = Integer.parseInt(st[0]);
    	int M = Integer.parseInt(st[1]);
    	int[][] A = input(N,M,br);
    	
    	
    	
    	String[] st1 = br.readLine().split(" ");
    	int K = Integer.parseInt(st1[1]);
    	int[][] B = input(M,K,br);

    	int[][] ans = multiply(A, B, N, M, K);
    	
    	printMake(ans);
    	bw.write(stb.toString());
        bw.flush();
    }
    
    static int[][] input(int i, int j, BufferedReader br) throws IOException {
    	int[][] result = new int[i][j];
    	
    	for(int ii=0;ii<i;ii++) {
    		String[] st = br.readLine().split(" ");
    		for(int jj=0;jj<j;jj++) {
    			result[ii][jj] = Integer.parseInt(st[jj]);
    		}
    	}
    	
    	return result;
    }

    static int[][] multiply(int[][] a, int[][] b, int N, int M, int K){
    	int[][] result = new int[N][K];
    	
    	 for (int i = 0; i < N; i++)
         {
             for (int j = 0; j < K; j++)
             {
                 for (int k = 0; k < M; k++)
                 {
                     result[i][j] += a[i][k] * b[k][j];
                 }
             }
         }
    	
    	 return result;
    }
    
    static void printMake(int[][] result){
        for (int i = 0; i < result.length; i++)
        {
            for (int j = 0; j < result[0].length; j++)
            {
                stb.append(result[i][j] + " ");
            }
            stb.append("\n");
        }
    }

}
