import java.util.Scanner;

public class Main {
	
	
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		
        int n = sc.nextInt();
        
        int[] podo = new int[n];
        int[] dp = new int[n];
        
        
        
        for(int i=0;i<n;i++)
        	podo[i]=sc.nextInt();
        if(n>=1)
        	dp[0] = podo[0];
        if(n>=2)
        	dp[1] = podo[0] + podo[1];
        
        if(n>=3)
        	dp[2]=Math.max(dp[1],Math.max(dp[0]+podo[2], podo[1]+podo[2]));
        
        for(int i=3;i<n;i++) {
        	dp[i] = Math.max(dp[i-1],Math.max(dp[i-2]+podo[i],dp[i-3]+podo[i-1]+podo[i]));
        }
        
        System.out.println(dp[n-1]);
	}

	
}
