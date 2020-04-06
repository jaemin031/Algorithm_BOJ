import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int room = 1;
		int maxroom = 1;
		int increase = 6;
		while(true) {
			if(N<=maxroom) {
				break;
			}
			maxroom += increase;
			increase += 6;
			room++;
		}
		
		System.out.println(room);
		
		
	}
}
