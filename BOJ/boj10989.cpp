#include<stdio.h>

int main()
{
	int N;
	int number[10001];
	int T;

	scanf("%d",&N);
	if(N<1||N>100000000)
		return 0;
	
	for(int i=1;i<=10000;i++)
		number[i]=0;

	for(int i=1;i<=N;i++)
	{
		scanf("%d",&T);
		if(T>10000)
			return 0;
		number[T]++;
	}

	for(int i=1;i<=10000;i++)
	{
		if(number[i]==0)
			continue;
		else
		{
			for(int j=1;j<=number[i];j++)
				printf("%d\n",i);
		}
	}
}
