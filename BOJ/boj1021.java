import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.List;
public class Main {
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	List<Integer> list = new LinkedList<>();
        
    	String st = br.readLine();
    	int N = Integer.parseInt(st.split(" ")[0]);
    	int M = Integer.parseInt(st.split(" ")[1]);
    	int result = 0;
    	
    	for(int i = 1 ; i<=N;i++)
    		list.add(i);
    	
    	String[] value = br.readLine().split(" ");
    	
    	for(int i=0;i<M;i++) {
    		int  num = Integer.parseInt(value[i]);
    		boolean flag = false;
    		while(!flag) {
    			if(list.get(0)==num) {
    				list.remove(0);
    				flag = true;
    			}
    			else {
    				if(list.indexOf(num)<=(list.size()/2)) {
    					list.add(list.size()-1,list.remove(0));
    				}else {
    					list.add(0,list.remove(list.size()-1));
    				}
    			
    				result++;
    			}
    		}
    	}
    	bw.write(result+"\n");
        bw.flush();
    }
}
