#include<stdio.h>

int main()
{
	int N;
	int K;
	int number[10001];
	int count=0;
	scanf("%d %d",&N,&K);


	for(int i=1;i<=N;i++)
	{
		if(N%i==0)
		{
			count++;
			number[count]=i;
		}
	}
	if(count<K)
		printf("0");
	else
		printf("%d",number[K]);
}
