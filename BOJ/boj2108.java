import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
 
public class Main {
	
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        List<Integer> numberList = new ArrayList<Integer>();
        int result1 = 0;
    	int result2;	//중앙값
    	int result3;	//최빈값
    	int result4;	//최댓값과 최소값의 차이
        int[] check = new int[8002];
        Arrays.fill(check,0);
        
        try {
        	int T = Integer.parseInt(br.readLine());
        	int k =0;
        	for(int i=0;i<T;i++) {
        		k = Integer.parseInt(br.readLine());
        		numberList.add(k);
        		result1+=k;
        		
        		
        		if(k==0) {
        			check[4001]++;
        		}else {
        			check[k+4001]++;
        		}
        			
        	}
        	
        	
        	
        	result1 = (int)Math.round((double)result1/T);
        	
        	Collections.sort(numberList);
        	
        	
        	
        	result2 = numberList.get(T/2);
        	
        	/////최빈값 아직 못구함
        	
        	int max = 0;
        	int bb = 0;
        	for(int i=1;i<8002;i++) {
        		if(max<check[i]) {
        			bb=i;
        			max = check[i];
        		}
        	}
        	int ct=0;
        	for(int i=1;i<8002;i++) {
        		if(max==check[i])
        			ct++;
        		if(ct==2) {
        			bb=i;
        			break;
        		}
        			
        	}
        	if(bb<4001) {
    			result3 = bb-4001;
    		}else if(bb==4001) { 
    			result3 = 0;
    		}else {
    			result3 = bb-4001;
    		}
        	
        	
        	result4 = Math.abs(numberList.get(0) - numberList.get(T-1));
        	
        	bw.write(result1 + "\n");
        	bw.write(result2 + "\n");
        	bw.write(result3 + "\n");
        	bw.write(result4 + "\n");
        	
    		bw.flush();
    		bw.close();
    		br.close();
    	} catch (IOException e) {
    		e.printStackTrace();
    	}
       
    }    
}
