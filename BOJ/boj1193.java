import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		
		int line = 1;
		int in = 2;
		int number=1;
		
		int i = 1;
		while(true){
			if(X<=i) {
				break;
			}
			line++;
			i+=in;
			in+=1;
		}
		int sum = 0;
		for(int j = 0;j<line;j++) {
			sum+=j;
		}
		
		int countNum = X-sum;
		
		if(line%2==0) {
			System.out.println(countNum+"/"+(line+1-countNum));
		}else {
			System.out.println((line+1-countNum)+"/"+countNum);
		}
		
		
	}
}
