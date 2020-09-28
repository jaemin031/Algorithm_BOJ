import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
			
			
			String st = sc.nextLine().trim();
			
			String[] count = st.split(" ");
			
			if(count[0].equals("")) {
				System.out.println("0");
			}else {
				System.out.println(count.length);
			}
	
	}
}
