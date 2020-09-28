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
        
    	String st = br.readLine();
    	String[] std = st.split(" ");
    	StringBuilder stb = new StringBuilder();
    	int n = Integer.parseInt(std[0]);
    	int term = Integer.parseInt(std[1]);
    	
    	int i = 1;
    	stb.append("<");
        for(;i<=n;i++)
        	que.add(i);

        int count = 0;
        
        while(que.size()!=0) {
        	int number = que.poll();
        	count++;
        	
        	if(count == term) {
        		stb.append(number+", ");
        		count=0;
        	}else {
        		que.add(number);
        	}
        	
        }
        stb.delete(stb.length()-2,stb.length());
        stb.append(">");
        bw.write(stb.toString());
        bw.flush();
    }
}
