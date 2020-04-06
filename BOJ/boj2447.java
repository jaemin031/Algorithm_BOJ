import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N =sc.nextInt();
		
		draw(N);
		
	}
	
	
	public static void draw(int N) {
		StringBuilder st = new StringBuilder();
		for(int i = 0 ; i < N ; i++) {
			for(int j = 0 ; j < N ; j++) {
				int x = i;
				int y = j;
				
				while(x>0) {
					if(x%3 == 1 && y%3 == 1)
						break;
					x /= 3;
					y /= 3;
				}
				
				st.append(x == 0 ? '*' : ' ');
				
			}
			
			st.append('\n');
		}
		System.out.println(st);
	}
}
	

