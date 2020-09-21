import java.util.Scanner;


public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int hum = Integer.parseInt(sc.nextLine());
		int[] card = new int[6];
		int[] maxNumber = new int[2]; 
		
		for(int i = 1;i<=hum;i++) {
			String[] st = sc.nextLine().split(" ");
			
			for(int j=1;j<=5;j++) {
				card[j] = Integer.parseInt(st[j-1]);
			}
			for(int q=1;q<=3;q++) {
				for(int w=q+1;w<=4;w++) {
					for(int e=w+1;e<=5;e++) {
						int num = (card[q]+card[w]+card[e])%10; 
						if(num>=maxNumber[1]) {
							maxNumber[0] = i;
							maxNumber[1] = num;
						}
					}
				}
			}
			
		}
		System.out.println(maxNumber[0]);

	}
	
	
}	

