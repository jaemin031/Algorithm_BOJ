import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;
public class Main {
	
	static int white = 0;
	static int blue = 0;
	
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    	int N = Integer.parseInt(br.readLine());
    	int[][] squre = new int[N][N];
    	
    	for(int i=0;i<N;i++) {
    		String[] st = br.readLine().split(" ");
    		for(int j=0;j<N;j++)
    			squre[i][j] = Integer.parseInt(st[j]);
    	}
    	
    	cut1(squre);

    	bw.write(white+"\n");
    	bw.write(blue+"\n");
    	
        bw.flush();
    }
    
    public static void cut1(int[][] box) {
    	if(check(box)) {
    		return;
    	}else {
    		int half = box.length/2;
    		cut1(cut2(box,	0,		half,			0,			half));
    		cut1(cut2(box,	0,		half,			half,		box.length));
    		cut1(cut2(box,	half,	box.length,		0,			half));
    		cut1(cut2(box,	half,	box.length,		half,		box.length));
    	}
    }
    
    public static int[][] cut2(int[][] box, int x_start, int x_end, int y_start, int y_end) {
    	int i=0;
    	int j=0;
    	int[][] box2 = new int[box.length/2][box.length/2];
    	
    	for(int x = x_start; x < x_end; x++) {
			for (int y = y_start; y < y_end; y++) {
				box2[i][j++] = box[x][y];
			}
			i++;
			j = 0;
		}
		return box2;
    	
    	
    }
    
    
    public static boolean check(int[][] box) {
    	int checkSum = box[0][0];
    	for(int i=0;i<box.length;i++) {
    		for(int j=0;j<box.length;j++) {
    			if(checkSum!=box[i][j]) {
    				return false;
    			}
    		}
    	}
    	if(checkSum==0)
    		white++;
    	if(checkSum==1)
    		blue++;
    	
    	return true;
    	
    }
    
}
