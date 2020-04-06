#include<stdio.h>

int main()
{
	int N;

	scanf("%d",&N);

	if(1<=N&&N<=100)
	{

		for(int i=1;i<=2*N-1;i++)
		{
			if(i<N)
			{
				for(int j=N-1;j>i-1;j--)
				{
					printf(" ");
				}
				for(int j=0;j<i;j++)
				{
					printf("*");
				}
			}
			else if(i==N)
			{
				for(int j=1;j<=N;j++)
					printf("*");
			}
			else
			{
				for(int j=0;j<i-N;j++)
				{
					printf(" ");
				}
				for(int j=i;j<N*2;j++)
				{
					printf("*");
				}
			}
			printf("\n");
		}
	}
}
