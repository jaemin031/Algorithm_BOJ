import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        String v = "666";
        int count = 0;
        int k = 0;
        while(count!=N) {
        	if(Integer.toString(k).indexOf(v) != -1) {
        		count++;
        	}
        	k++;
        }
        System.out.println(k-1);
        
        
    }
}
