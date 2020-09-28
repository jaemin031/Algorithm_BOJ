import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;
public class Main {
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	Deque<Integer> deq = new LinkedList<>();
        
    	int testCase = Integer.parseInt(br.readLine());
    	
    	while(testCase-->0) {
    		String st = br.readLine();
    		
    		if(st.contains("push_front")) {
    			deq.addFirst(Integer.parseInt(st.split(" ")[1]));
    		}else if(st.contains("push_back")) {
    			deq.addLast(Integer.parseInt(st.split(" ")[1]));
    		}else if(st.equals("pop_front")) {
    			bw.write(deq.isEmpty()?"-1\n":deq.pop()+"\n");
    		}else if(st.equals("pop_back")) {
    			bw.write(deq.isEmpty()?"-1\n":deq.removeLast()+"\n");
    		}else if(st.equals("size")) {
    			bw.write(deq.size()+"\n");
    		}else if(st.equals("empty")) {
    			bw.write(deq.isEmpty()?"1\n":"0\n");
    		}else if(st.equals("front")) {
    			bw.write(deq.isEmpty()?"-1\n":deq.peek()+"\n");
    		}else if(st.equals("back")) {
    			bw.write(deq.isEmpty()?"-1\n":deq.peekLast()+"\n");
    		}
    		
    	}
    	
        bw.flush();
    }
}
