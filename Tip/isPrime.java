public class isPrime {
	 public static boolean isPrime3(int num) {
	        boolean result = true;
	        int end = (int)Math.sqrt(num);
	        for(int i = 2; i <= end; i++) {
	            if( num%i == 0) {
	                result = false;
	                break; 
	                //나누어 떨어지면 더이상 소수가 아니므로 break를 걸어 for문을 끝낸다.
	            } else {
	                result = true;
	            }
	        }        
	        return result;        
	    }
}
