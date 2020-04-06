import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
 
public class Main {
	
	static int[] ar;
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        
        try {
        	int T = Integer.parseInt(br.readLine());
        	ar = new int[T];
        	for(int i=0;i<T;i++)
        		ar[i] = Integer.parseInt(br.readLine());

        	quick(ar, 0, ar.length - 1);
        	
        	
        	for(int i = 0 ; i<T;i++)
        		bw.write(ar[i]+"\n");
        	
    		bw.flush();
    		bw.close();
    		br.close();
    	} catch (IOException e) {
    		e.printStackTrace();
    	}
       
    }

    static void quick(int[] nums, int left, int right) {
        int pl = left;
        int pr = right;
        int pivot = nums[(pl + pr) / 2];

        do {
            while (nums[pl] < pivot) pl++;
            while (nums[pr] > pivot) pr--;
            if (pl <= pr)
                change(nums, pl++, pr--);

        } while (pl <= pr);
        if (left < pr) quick(nums, left, pr);
        if (right > pl) quick(nums, pl, right);
    }
    
    public static void change(int[] a, int b, int c) {
    	int tmp = a[b];
    	a[b]=a[c];
    	a[c]=tmp;
    }
    
}
