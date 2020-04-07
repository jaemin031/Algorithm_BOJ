import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
			int line = Integer.parseInt(sc.nextLine());
			int result = 0;
			
			String st = sc.nextLine();
			
			for(int i = 0; i<line;i++) {
				result += Integer.parseInt(st.substring(i,i+1));
			}
			
			System.out.println(result);
	
	}
}
