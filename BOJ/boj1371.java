import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static int p[] = new int[26];
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder stb = new StringBuilder();
		int ch;
		int maxNumber = Integer.MIN_VALUE;
		Arrays.fill(p,0);
		String st;
		
		while(sc.hasNextLine()) {
			st = sc.nextLine();
			for(int i=0;i<st.length();i++) {
				ch = (int)st.charAt(i);
				if(ch>=97&&ch<=122) {
					p[ch-97]++;
					maxNumber = Math.max(maxNumber,p[ch-97]);
				}
				
			}
		}
		
		for(int i=0;i<26;i++) {
			if(p[i] == maxNumber)
				stb.append((char)(i+97));
		}
		bw.write(stb.toString() + "\n");
		bw.flush();
		bw.close();
	}
	
}
