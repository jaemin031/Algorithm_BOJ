import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
	
	static int max = Integer.MIN_VALUE;
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int count = Integer.parseInt(br.readLine());
		int[] arr = new int[count];
        List<Integer> list = new LinkedList<>();
        
		for(int i=0;i<count;i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		int gcd = arr[1]-arr[0];
		
		for(int i=2;i<count;i++) {
			int dst = arr[i] - arr[i-1];
			
			gcd = getGCD(gcd,dst);
			
			
		}
		
	    list.add(gcd);
	        
	    for (int i = 2; i <= Math.sqrt(gcd); i++)
	    {
	    	if (gcd % i == 0)
	        {
	            if (i == gcd / i)
	            	list.add(i);
	                else
	                {
	                    list.add(i);
	                    list.add(gcd / i);
	                }
	        }
	    }
	    Collections.sort(list);
		
	    for(int i =0; i<list.size();i++)
	    	bw.write(list.get(i).toString() + " ");
		
		
		bw.flush();
		bw.close();
		br.close();
	}
	
	public static int getGCD(int a, int b) {
        if(b == 0) return 0;
        
        while(b > 0) {
            int tmp = a;
            a = b;
            b = tmp%b;
        }
        return a;
    }
	
}
