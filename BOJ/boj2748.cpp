#include<stdio.h>



int main()
{
	int N;
	long long int number[92];
	scanf("%d",&N);
	if(N>90)
		return 0;
	number[0]=0;
	number[1]=1;

	for(int i=2;i<=90;i++)
		number[i]=number[i-1]+number[i-2];
	printf("%lld",number[N]);
}
