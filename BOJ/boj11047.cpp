#include<stdio.h>

int main()
{
	int N,K;
	int number[11];
	int count=0;

	scanf("%d %d",&N,&K);

	for(int i=1;i<=N;i++)
		scanf("%d",&number[i]);

	while(K!=0)
	{
		if(K<number[N])
			N--;
		else
		{
			K-=number[N];
			count++;
		}
	}
	printf("%d",count);
}
