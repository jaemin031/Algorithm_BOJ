import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static int A,B,C;
	static int[] card_A;
	static int[] card_B;
	static int[] card_C;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int result = Integer.MAX_VALUE;
		String[] st = br.readLine().split(" ");
		A = Integer.parseInt(st[0]);
		B = Integer.parseInt(st[1]);
		C = Integer.parseInt(st[2]);
		
		card_A = new int[A];
		card_B = new int[B];	
		card_C = new int[C];
		
		for(int i=0;i<3;i++) {
			String[] st2 = br.readLine().split(" ");
			for(int j=0;j<st2.length;j++) {
				if(i==0)
					card_A[j] = Integer.parseInt(st2[j]);
				if(i==1)
					card_B[j] = Integer.parseInt(st2[j]);
				if(i==2)
					card_C[j] = Integer.parseInt(st2[j]);
			}
		}
		
		for(int i=0;i<A;i++) {
			for(int j=0;j<B;j++) {
				for(int k=0;k<C;k++) {
					result = Math.min(result,Math.abs(Math.max(Math.max(card_A[i], card_B[j]),card_C[k])- Math.min(Math.min(card_A[i], card_B[j]),card_C[k])));
				}
			}
		}
		
		bw.write(result + "\n");
		bw.flush();
		bw.close();
		br.close();
	}
}
