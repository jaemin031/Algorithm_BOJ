import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		
		while(n-->0) {
			String st = br.readLine();
			rotate(st);
		}
		br.close();
	}
	
	static void rotate(String st) {
		int len = st.length();
		int size = (int)Math.sqrt(len);
		char[][] letter = new char[size][size];
		int count=0;
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				letter[i][j] = st.charAt(count);
				count++;
			}
		}
		
		for(int i=0;i<size;i++){
	        for(int j =0;j<size;j++){
	                System.out.print(letter[j][size-i-1]);
	        }
	    }
		System.out.println();
	}
}



