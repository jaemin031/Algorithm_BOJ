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
    	Queue<Integer> que = new LinkedList<Integer>();
        
        int n = Integer.parseInt(br.readLine());
        
        int rear =0;
        while(n-->0) {
        	String input = br.readLine();
        	if(input.contains("push")) {
        		rear = Integer.parseInt(input.split(" ")[1]);
        		que.add(rear);
        	}else if(input.equals("pop")) {
        		if(que.isEmpty()) {
        			bw.write("-1\n");
        		}else {
        			bw.write(que.poll() + "\n");
        		}
        	}else if(input.equals("size")) {
        		bw.write(que.size() + "\n");
        	}else if(input.equals("empty")) {
        		if(que.isEmpty()) {
        			bw.write("1\n");
        		}else {
        			bw.write("0\n");
        		}
        	}else if(input.equals("front")) {
        		if(que.isEmpty()) {
        			bw.write("-1\n");
        		}else {
        			bw.write(que.peek() + "\n");
        		}
        	}else if(input.equals("back")) {
        		if(que.isEmpty()) {
        			bw.write("-1\n");
        		}else {
        			bw.write(rear + "\n");
        		}
        	}
        	
        	
        }
        
        bw.flush();
    }
}
