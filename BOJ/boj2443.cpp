#include<stdio.h>

int main()
{
	int N;

	scanf("%d",&N);
	

	if(1<=N&&N<=100)
	{
		for(int i=1;i<=N;i++)
		{
			for(int j=1;j<i;j++)
				printf(" ");
			for(int j=2*N-1;j>=2*i-1;j--)
			{
				printf("*");
			}
			printf("\n");
		}
	}
}
