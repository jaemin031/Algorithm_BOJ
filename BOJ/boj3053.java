import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("0.000000");
    	Scanner sc = new Scanner(System.in); int r = sc.nextInt();
    	double pi = Math.PI;
    	System.out.println(df.format(r*r*pi));
    	System.out.println(df.format(r*r*2));
	}
}
