#include<stdio.h>


int main()
{
	int N;
	int temp;
	int P[1001];
	int sumtime=0;

	scanf("%d",&N);

	for(int i=1;i<=N;i++)
		scanf("%d",&P[i]);

	for(int i=1;i<N;i++)
	{
		for(int j=i+1;j<=N;j++)
			if(P[i]>P[j])
			{
				temp=P[j];
				P[j]=P[i];
				P[i]=temp;
			}
	}

	for(int i=1;i<=N;i++)
	{
		for(int j=1;j<=i;j++)
			sumtime+=P[j];
	}
	printf("%d",sumtime);
}
