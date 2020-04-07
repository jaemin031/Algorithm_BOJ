import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int testcase = sc.nextInt();
		int count	=	0;
		
		while(testcase!=0) {
			count = sc.nextInt();
			HashMap<String,Integer> map = new HashMap<>();
			
			for(int i=0;i<count;i++) {
				sc.next();
				String st = sc.next();
				if(map.containsKey(st)) {
					int num = map.get(st);
					map.put(st,num+1);
				}else {
					map.put(st, 1);
				}
			}
			
			int result = 1;
			for(int n:map.values()) {
				result *= n+1;
			}
			
			System.out.println(result - 1);
			
			testcase--;
		}
		
		

		
	}
	
}
