import java.util.Scanner;

public class Main {
	public static void main(String[] args)   {
		Scanner sc = new Scanner(System.in);
		long fiboNumber[] = new long[91];
		fiboNumber[0] = 0;
		fiboNumber[1] = 1;
		
		int n = sc.nextInt();
		
		for(int i=2;i<=n;i++)
			fiboNumber[i] = fiboNumber[i-1] + fiboNumber[i-2];

		System.out.println(fiboNumber[n]);
	}
	
	
}
