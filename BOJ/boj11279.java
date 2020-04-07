import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		PriorityQueue<Integer> arr = new PriorityQueue<Integer>(new cdk());

		int N = Integer.parseInt(br.readLine());
		
		while(N-->0) {
			int num = Integer.parseInt(br.readLine());
			
			if(num == 0) {
				if(arr.peek() != null) {
					bw.write(arr.poll() + "\n");
				}else
					bw.write("0\n");
				
			}else
				arr.add(num);
			
		}

    	bw.flush();
    }
    
}
class cdk implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		if(o1<o2)
			return 1;
		else
			return -1;
	}
	
}
