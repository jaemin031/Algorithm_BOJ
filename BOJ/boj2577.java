import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int A,B,C;
		int num;
		int[] number = new int[10];
		
		Scanner scanner = new Scanner(System.in);
		
		A=Integer.parseInt(scanner.nextLine().trim());
		B=Integer.parseInt(scanner.nextLine().trim());
		C=Integer.parseInt(scanner.nextLine().trim());
		num=A*B*C;
		
		while(num>0){
				number[num%10]++;
				num/=10;
				
		}
		for(int i=0;i<=number.length-1;i++)
			System.out.printf("%d\n",number[i]);
	
		scanner.close();
		scanner=null;		
		
	}

}
