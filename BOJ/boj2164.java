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
        int i = 1;
        for(;i<=n;i++)
        	que.add(i);
        while(que.size()!=1) {
        	que.poll();
        	if(que.size()==1)
        		break;
        	que.add(que.poll());
        }
        bw.write(que.poll() + "\n");
        bw.flush();
    }
}
