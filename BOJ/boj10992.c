#include<stdio.h>

int main()
{
	int N;

	scanf("%d",&N);

	if(1<=N&&N<=100)
	{
		for(int i=1;i<=N;i++)
		{
			for(int j=N-1;j>=i;j--)
				printf(" ");
			if(i==1)
				printf("*");
			else if(i==N)
			{
				for(int j=1;j<=2*N-1;j++)
					printf("*");
			}
			else
			{
				printf("*");
				for(int k=2*i-3;k>0;k--)
				{
					printf(" ");
				}
				printf("*");
			}

			printf("\n");
		}
	}
}
