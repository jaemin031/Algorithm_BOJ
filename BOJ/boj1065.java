import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	int input = 0;
	int result = 0;
	int a[] = new int[3];
	
	try {
		input = Integer.parseInt(br.readLine());
		if(input<100) {
			result = input;
			bw.write(result + "");
		}else {
			for(int i = 100; i<=input ; i++) {
				int k = 0; int t = i;
				if(i == 1000)
					break;
				while(t > 0) {
					a[k] = t % 10;
					t /= 10;
					k++;
				}
				if(a[0]-a[1] == a[1]-a[2]) {
					result++;
				}
			}
			result += 99;
			bw.write(result + "");
		}
		br.close();
		bw.flush();
		bw.close();
	} catch (NumberFormatException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
	
		
	}
}
