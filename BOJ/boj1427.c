#include<stdio.h>

int main()
{
	int number[11];
	long long int N;
						//	10 00000000	=	10^9;
	long long int j=1000000000;
	int temp;
	int lenth=10;
	scanf("%lld",&N);

	for(int i=1;i<=10;i++)
	{
		if(N<j)
		{
			lenth--;
		}
		j=j/10;
	}
	j=1;
	for(int i=1;i<lenth;i++)
		j*=10;

	for(int i=0;i<lenth;i++)
	{
		number[i]=N/j;
		N=N%j;
		j=j/10;
	}
	for(int i=0;i<lenth;i++)
	{
		for(int j=i;j<lenth;j++)
			if(number[i]<number[j])
			{
				temp=number[i];
				number[i]=number[j];
				number[j]=temp;
			}
	}
	for(int i=0;i<lenth;i++)
		printf("%d",number[i]);
}
