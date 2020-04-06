import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) {
		boolean[] checkSelfNumber = new boolean[10001];
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		for(int i=1;i<=10000;i++) {
			int dn = getDn(i);
			if(dn <= 10000) {
				checkSelfNumber[dn] = true;
			}
		}
		try {
			for(int i=1;i<=10000;i++) {
				if(!checkSelfNumber[i]) {
					bw.write(i + "\n");
				}
			}
			bw.flush();
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	private static int getDn(int n) {
		int dn = n;
		while(n>0) {
			dn += n%10;
			n = n/10;
		}
		
		return dn;
	}

}
