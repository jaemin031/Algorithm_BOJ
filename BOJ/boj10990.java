import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=Integer.parseInt(sc.nextLine());
		for(int i=0;i<N;i++){
			for(int j=i+1;j<N;j++){
				System.out.print(" ");
			}
			System.out.print("*");
			for(int j=0;j<=2*i-1;j++){
				if(j==2*i-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		sc.close();
		sc=null;
	}

}
