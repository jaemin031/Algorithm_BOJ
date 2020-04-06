import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=Integer.parseInt(sc.nextLine().trim());
		int[] fv = new int[n+1];
		fv[0]=0;
		fv[1]=1;
		for(int i=2;i<n+1;i++)
			fv[i]=fv[i-1]+fv[i-2];
		System.out.println(fv[n]);
		
		sc.close();
		sc=null;
		
	}

}
