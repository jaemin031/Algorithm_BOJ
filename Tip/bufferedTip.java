import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class bufferedTip {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	try {
		String line = br.readLine();
		for(int i=0;i<Integer.parseInt(line);i++) {
			String[] aa = br.readLine().split(" ");
			bw.write(Integer.parseInt(aa[0]) + Integer.parseInt(aa[1])+"\n");
			
		}
		bw.flush();
		bw.close();
		br.close();
	} catch (IOException e) {
		e.printStackTrace();
	}
}
