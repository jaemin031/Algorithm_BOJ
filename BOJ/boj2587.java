import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		int[] num = new int[5];
		int sum=0;
		int tmp=0;
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0;i<num.length;i++){
			num[i]= Integer.parseInt((scanner.nextLine().trim()));
			sum+=num[i];
		}
		
		for(int i=0;i<num.length-1;i++){
			for(int j=i+1;j<num.length;j++){
				
				if(num[i]>num[j]){
					tmp=num[i];
					num[i]=num[j];
					num[j]=tmp;
				}
			}	
		}
		
		
		System.out.printf("%d\n%d",(int)(sum/5),num[2]);
		
		scanner.close();
		scanner=null;
	}

}
