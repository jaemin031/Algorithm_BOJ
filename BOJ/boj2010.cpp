#include<stdio.h>

int main()
{
	int N;
	int max=0;
	int t;
	scanf("%d",&N);
	max=max-N+1;
	for(int i=1;i<=N;i++)
	{
		scanf("%d",&t);
		max+=t;
	}
	printf("%d",max);
}
