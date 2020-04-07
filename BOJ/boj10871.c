#include<stdio.h>

int main()
{
	int N;
	int X;
	int number[10001];

	scanf("%d %d",&N,&X);
	
	if(1>N||N>10000||1>X||X>10000)
		return 0;
	
	for(int i=1;i<=N;i++)
	{
		scanf("%d",&number[i]);
		if(number[i]<1||number[i]>10000)
			return 0;
	}

	for(int i=1;i<=N;i++)
	{
		if(number[i]<X)
			printf("%d ",number[i]);
	}
}
