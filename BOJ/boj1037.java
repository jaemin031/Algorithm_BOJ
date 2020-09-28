import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int count = Integer.parseInt(br.readLine());
		int[] arr = new int[count];
		StringTokenizer stk = new StringTokenizer(br.readLine());
		
		for(int i = 0 ; i< count ;i++)
			arr[i] = Integer.parseInt(stk.nextToken());
		
		quickSort(arr, 0, arr.length - 1);
		
		bw.write(arr[0]*arr[count-1]+"\n");
		
		bw.flush();
		bw.close();
		br.close();
	}

	 static void quickSort(int[] nums, int left, int right) {
	     int pl = left;
	     int pr = right;
	     int x = nums[(pl + pr) / 2];

	     do {
	         while (nums[pl] < x) pl++;
	         while (nums[pr] > x) pr--;
	         if (pl <= pr)
	             swap(nums, pl++, pr--);

	     } while (pl <= pr);
	     if (left < pr) quickSort(nums, left, pr);
	     if (right > pl) quickSort(nums, pl, right);
	 }

	 private static void swap(int[] a, int i, int j) {
	     int tmp = a[i];
	     a[i] = a[j];
	     a[j] = tmp;
	 }
	
}
