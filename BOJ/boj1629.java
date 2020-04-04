import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.Deque;
import java.util.LinkedList;
public class Main {
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    	String[] st = br.readLine().split(" ");
    	int A = Integer.parseInt(st[0]);
    	int B = Integer.parseInt(st[1]);
    	int C = Integer.parseInt(st[2]);
    	long multiple = A%C;
    	long result = 1;
    	
    	while(B>0) {
    		if(B%2==1){
    			result *= multiple;
    			result%=C;
			}
			multiple = ((multiple%C)*(multiple%C))%C;
			B/=2;
    	}

    	bw.write(result + "\n");    		

    	
        bw.flush();
    }
}
