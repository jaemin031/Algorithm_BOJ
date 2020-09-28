import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t= Integer.parseInt(sc.nextLine().trim());

		while(t!=0){
			int k=Integer.parseInt(sc.nextLine().trim());
			int[] dp = new int[12];
			dp[0]=1;
			
			for(int i=1;i<=k;i++){
				if(i-1>=0){
					dp[i]+=dp[i-1];
				}
				if(i-2>=0){
					dp[i]+=dp[i-2];
				}
				if(i-3>=0){
					dp[i]+=dp[i-3];
				}
			}

			System.out.println(dp[k]);
			t--;
			
		}
		
		sc.close();
		sc=null;
	}

}
