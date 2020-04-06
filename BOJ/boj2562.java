import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int[] num = new int[9];
		int max_value = 0;
		int max_number=0;
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0;i<=num.length-1;i++){
			num[i]=Integer.parseInt(scanner.nextLine());
			if(max_value<num[i]){
				max_number=i;
				max_value=num[i];
			}
		}
		
		System.out.println(max_value);
		System.out.println(max_number+1);
		
		
		scanner.close();
		scanner=null;
	}

}
