#include <stdio.h>

int main()
{
	char N[30];
	long long B;

	long long value = 0;

	scanf("%s %lld", N, &B);

	if (65 <= N[0] && N[0] <= 90)
		value = N[0] - 55;
	else if (48 <= N[0] && N[0] <= 57)
		value = N[0] - 48;

	for (int i = 1; N[i] != NULL; i++)
	{
		value *= B;
		if (65 <= N[i] && N[i] <= 90)	// 대문자	-55
		{
			value += N[i] - 55;
		}
		else if (48 <= N[i] && N[i] <= 57)	// 숫자	-48
		{
			value += N[i] - 48;
		}

	}
	printf("%lld", value);
}
