#include<stdio.h>

int main()
{
	int K,N,M;
	int sum=0;

	scanf("%d %d %d",&K,&N,&M);

	if(1>K||K>1000||1>N||N>1000||1>M||M>100000)
		return 0;

	sum=K*N;

	if(sum>M)
		printf("%d",sum-M);
	else
		printf("0");
}
