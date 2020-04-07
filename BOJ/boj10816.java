import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	StringBuilder stb = new StringBuilder();
    	int N = Integer.parseInt(br.readLine());
    	Map<String, Integer> map = new HashMap<>();
    	
    	String[] st1 = br.readLine().split(" ");
    	
    	for(int i=0;i<N;i++) {
    		if(map.containsKey(st1[i])) {
    			map.put(st1[i], map.get(st1[i])+1);
    		}else
    			map.put(st1[i], 1);
    	}
    	
    	int M = Integer.parseInt(br.readLine());

    	String[] st2 = br.readLine().split(" ");
    	
    	for(int i=0;i<M;i++) {
    		if(map.containsKey(st2[i]))
    			stb.append(map.get(st2[i])+" ");
    		else
    			stb.append("0 ");
    	}
    	
    	bw.write(stb.toString());
    	bw.flush();
    }
    
    
    
    
}
