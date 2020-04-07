import java.util.Scanner;

public class Main {

	public static int count = 0;
	public static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N =sc.nextInt();
		hanoiTower(N,1,2,3);
		System.out.println(count);
		System.out.println(sb);
	}
	
	public static void hanoiTower(int n, int a, int b, int c) {
		count++;
		
		if(n == 1)
			sb.append(a + " " + c + "\n");
		else {
			hanoiTower(n-1,a,c,b);
			sb.append(a + " " + c + "\n");
			hanoiTower(n-1,b,a,c);
		}
		
	}
	
}
	

