import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
public class Main {
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	LinkedList<Integer> que;
        
    	int testCase = Integer.parseInt(br.readLine());
    	
    	while(testCase-->0) {
    		String[] st = br.readLine().split(" ");
    		String[] pt = br.readLine().split(" ");
    		int N = Integer.parseInt(st[0]);
    		int M = Integer.parseInt(st[1]);
    		
    		que = new LinkedList<Integer>();
    		
    		for(int i=0;i<N;i++)
    			que.add(Integer.parseInt(pt[i]));
    		
    		int printNumber = 0;
    		
    		if(N==1)
    			bw.write("1\n");
    		else {
    			while(!que.isEmpty()) {
	    			boolean flag = true;
	    			for(int i=0;i<que.size();i++) {
	    				if(que.peek()<que.get(i)) {
	    					flag = false;
	    					break;
	    				}
	    			}
	    			if(flag) {
	    				printNumber++;
	    				que.poll();
	    				if(M==0)
	    					break;
	    				else
	    					M-=1;
	    				
	    			}else {
	    				int temp = que.poll();
	    				que.add(temp);
	    				M =(M==0)? que.size()-1:--M;
	    			}
	    				
	    		}
	    		
    			bw.write(printNumber + "\n");
    		}
    	}
    	
        bw.flush();
    }
}
