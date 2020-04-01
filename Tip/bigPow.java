public class bigPow {
	public static long pow(int x) {  // 2의 x승 구하는 함수

		if (x == 0) return 1; 

		if (x == 1) return 2;



		long value = pow(x / 2);

		if (x % 2 == 0) {

			return (value * value) % 1000000007; // 2^2x = 2^x * 2^x

		}

		else {

			return (((value * value) % 1000000007) * 2) % 1000000007; // 2^(2x + 1) = 2^x * 2^x * 2

		}

	}
}
// 만약 1000000007의 나머지를 구한다면 위의 것 

public static long pow(int x) {  // 2의 x승 구하는 함수

	if (x == 0) return 1; 

	if (x == 1) return 2;



	long value = pow(x / 2);

	if (x % 2 == 0) {

		return (value * value); // 2^2x = 2^x * 2^x

	}

	else {

		return ((value * value) * 2); // 2^(2x + 1) = 2^x * 2^x * 2

	}

}
