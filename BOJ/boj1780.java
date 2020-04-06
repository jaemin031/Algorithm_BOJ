import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;
public class Main {
	
	static int minusCount = 0;
	static int zeroCount = 0;
	static int plusCount = 0;
	
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    	int N = Integer.parseInt(br.readLine());
    	int[][] paper = new int[N][N];
    	
    	for(int i=0;i<N;i++) {
    		String[] st = br.readLine().split(" ");
    		for(int j=0;j<N;j++) {
    			paper[i][j] = Integer.parseInt(st[j]);
    		}
    	}
    	
    	curt(paper);
    	
    	bw.write(minusCount + "\n");
    	bw.write(zeroCount + "\n");
    	bw.write(plusCount + "\n");
    	
        bw.flush();
    }
    
    static void curt(int[][] box) {
    	if(check(box)) {
    		return;
    	}else {
    		int third = box.length/3;
    		int multiThird = third*2;
    		
    		curt(curting(box, 0,			third,			0,			third));
    		curt(curting(box, third,		multiThird, 	0,			third));
    		curt(curting(box, multiThird,	box.length,		0,			third));
    		
    		curt(curting(box, 0,			third,			third,		multiThird));
    		curt(curting(box, third,		multiThird, 	third,		multiThird));
    		curt(curting(box, multiThird,	box.length,		third,		multiThird));
    		
    		curt(curting(box, 0,			third,			multiThird,	box.length));
    		curt(curting(box, third,		multiThird, 	multiThird,	box.length));
    		curt(curting(box, multiThird,	box.length,		multiThird,	box.length));
    		
    		
    	}
    }
    
    static boolean check(int[][] box) {
    	int flag = box[0][0];
    	
    	for(int i=0;i<box.length;i++) {
    		for(int j=0;j<box.length;j++) {
    			if(flag!=box[i][j])
    				return false;
    		}
    	}
    	
    	if(flag==-1) {
    		minusCount++;
    	}else if(flag==0) {
    		zeroCount++;
    	}else if(flag==1) {
    		plusCount++;
    	}
    	
    	return true;
    	
    }
    
    static int[][] curting(int[][] box, int xStart, int xEnd, int yStart, int yEnd){
    	int[][] result = new int[box.length/3][box.length/3];
    	
    	int xx=0;
    	int yy=0;
    	
    	for(int y=yStart;y<yEnd;y++) {
    		xx = 0;
    		for(int x=xStart;x<xEnd;x++) {
    			result[yy][xx] = box[y][x];
    			xx++;
    		}
    		yy++;
    	}
    	
    	return result;
    }

}
