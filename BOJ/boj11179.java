import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s=Integer.toBinaryString(Integer.parseInt(sc.nextLine()));
		int[] ss = new int[s.length()]; 

		for(int i=s.length()-1,j=0;i>=0;i--,j++){
			ss[i]=(int)(s.charAt(j))-48;
		}
		
		for(int i=1;i<=ss.length-1;i++){
			ss[i]+=ss[i-1]*2;
		}
		System.out.println(ss[ss.length-1]);
				
		sc.close();
		sc=null;
	}

}
