import java.util.Scanner;

public class Main {
	static int[] number;
	static int[] op = new int[4];
	static int max = Integer.MIN_VALUE;
	static int min = Integer.MAX_VALUE;
	static int numberCount;
	
	public static void main(String[] args)   {
		
		Scanner sc = new Scanner(System.in);
		numberCount = sc.nextInt();
		number = new int[numberCount];
		
		for(int i=0;i<numberCount;i++)
			number[i] = sc.nextInt();
		
		for(int i=0;i<4;i++)
			op[i]=sc.nextInt();
		
		
		dfs(number[0],1);
		System.out.println(max);
		System.out.println(min);
	}
	
	static void dfs(int num, int idx) {
		if(idx == numberCount) {
			if(num>max)
				max = num;
			if(num<min)
				min = num;
			
			return;
		}
		
		int result = 0;
		
		for(int i=0;i<4;i++) {
			if(op[i]!=0) {
				op[i]--;
				
				switch(i) {
				
				case 0:
					result = num + number[idx];
					break;
				case 1:
					result = num - number[idx];
					break;					
				case 2:
					result = num * number[idx];
					break;
				case 3:
					if(num<0&&number[idx]>0) {
						num*=-1;
						result = num/ number[idx];
						result*=-1;
						
					}else {
						result = num / number[idx];
					}
					break;
						
				
				
				}
				dfs(result,idx+1);
				op[i]++;
			}
		}
			
	}
}
