public class getGcd {
	public static int getGCD(int a, int b) {
        if(b == 0) return 0;
        
        while(b > 0) {
            int tmp = a;
            a = b;
            b = tmp%b;
        }
        return a;
    }
}
