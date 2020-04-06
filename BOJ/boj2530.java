import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int A=0,B=0,C=0,D=0;
		String input;
		input = scanner.nextLine();
		StringTokenizer s = new StringTokenizer(input," ");
		int num;
		final int k=86400;
		
		for(int i=0;i<3;i++){
			switch(i){
			case 0:
				A=Integer.parseInt(s.nextToken());
				break;
			case 1:
				B=Integer.parseInt(s.nextToken());
				break;
			case 2:
				C=Integer.parseInt(s.nextToken());
				break;
			}
		}
		
		D = Integer.parseInt(scanner.nextLine());
		
		num=(A*60*60)+(B*60)+C+D;
		if(num>=86400)
			num%=k;
		C=num%60;
		num/=60;
		B=num%60;
		A=num/60;
		System.out.printf("%d %d %d",A,B,C);
		
		scanner.close();
		scanner=null;
	}

}
