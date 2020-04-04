import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		int E = sc.nextInt()-1;		//	1~15
		int S = sc.nextInt()-1;		//	1~28
		int M = sc.nextInt()-1;		//	1~19
		
		int year = 0;
		
		while(true) {
			if((year%15 == E) && (year%28 == S) && (year%19 == M)) {
				System.out.println(year+1);
				break;
			}
			year++;
		}
	}
	
}
