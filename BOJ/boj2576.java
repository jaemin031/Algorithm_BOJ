import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		int[] num = new int[7];
		int sum = 0;
		int min = 101;

		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < num.length; i++) {
			num[i] = Integer.parseInt(scanner.nextLine());

			if (!((num[i] % 2) == 0)) {

				sum += num[i];
				if (num[i] < min) {
					min = num[i];
				}
			}
		}
		if (min == 101)
			System.out.println(-1);
		else
			System.out.printf("%d\n%d", sum, min);

		scanner.close();
		scanner = null;

	}

}
