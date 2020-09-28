#include<stdio.h>

int main()
{
	int N;
	long long M;
	int A[10001];
	int count=0;
	int sum=0;

	scanf("%d %lld",&N,&M);

	if(1>N||N>10000||1>M||M>300000000)
		return 0;

	for(int i=1;i<=N;i++)
	{
		scanf("%d",&A[i]);
		if(A[i]>30000)
			return 0;
	}

	for(int i=1;i<=N;i++)
	{
		sum=0;
		for(int j=i;j<=N;j++)
		{
			sum+=A[j];
			if(sum==M)
			{
				count++;
				break;
			}
			else if(sum>M)
				break;
		}
	}

	printf("%d",count);
}
