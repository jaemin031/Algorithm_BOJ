import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=Integer.parseInt(sc.nextLine().trim());
		
		for(int i=1;i<=2*N-1;i++){
			if(i<N){
				for(int j=1;j<=i;j++){
					System.out.print("*");
				}
			}
			else if(i==N){
				for(int j=1;j<=N;j++){
					System.out.print("*");
				}
			}
			else{
				for(int j=1;j<=(2*N-1)-i+1;j++){
					System.out.print("*");
				}
			}
			System.out.println();
		}
		sc.close();
		sc=null;
	}

}
