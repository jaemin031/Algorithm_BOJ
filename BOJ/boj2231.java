import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int value = 0;
		
		for(int i = 0;i<N;i++) {
			if((i+getDn(i))==N) {
				value = i;
				break;
			}
		}
		System.out.println(value);
	}
	
	private static int getDn(int n) {
        int dn = 0;
        while(n > 0) {
            dn += n % 10;
            n /= 10;
        }
        return dn;
    }
}
	

