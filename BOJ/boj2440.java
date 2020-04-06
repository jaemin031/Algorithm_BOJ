import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner;
		scanner=new Scanner(System.in);
		
		int input;
		input=Integer.parseInt(scanner.nextLine());
		
		for(;input>0;input--){
			for(int i=1;i<=input;i++){
				System.out.print('*');
			}
			System.out.printf("\n");
		}
			
		scanner.close();
		scanner = null;
		


	}

}
