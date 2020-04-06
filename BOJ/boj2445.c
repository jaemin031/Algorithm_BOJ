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
				for(int j=i;j>0;j--)
					printf("*");
				for(int j=0;j<(2*N)-(2*i);j++)
					printf(" ");
				for(int j=i;j>0;j--)
					printf("*");
			}
			else if(i==N)
			{
				for(int j=1;j<=2*N;j++)
					printf("*");
			}
			else
			{
				for(int j=i-N;j<N;j++)
					printf("*");
				for(int j=0;j<2*(i-N);j++)
					printf(" ");
				for(int j=i-N;j<N;j++)
					printf("*");
			}

			printf("\n");
		}
	}
}
