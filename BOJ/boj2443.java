import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		int N=0,i=0,j=0;
		Scanner scanner = new Scanner(System.in);
		N=Integer.parseInt(scanner.nextLine());
		
		for(;i<N;i++){
			for(j=(2*N)-(i*2)-1;j>0;j--){
				System.out.print('*');
			}
			System.out.print('\n');
			for(int p=0;p<i+1;p++){
				System.out.print(' ');
			}
		}
		
		
		scanner.close();
		scanner = null;
		
	}

}
