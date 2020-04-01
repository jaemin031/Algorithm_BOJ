public class eachSumNumber {
	// 각 자릿수 합치기
	
    private static int getDn(int n) {
        int dn = 0;
        while(n > 0) {
            dn += n % 10;
            n /= 10;
        }
        return dn;
    }
}
