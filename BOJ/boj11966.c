#include<stdio.h>

int main()
{
	int N;
	scanf("%d",&N);

	for(;N>2;)
	{
		if(N%2!=0)
		{
			printf("0");
			return 0;
		}
		else
		{
			N/=2;
		}
	}
	printf("1");
}
