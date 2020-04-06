#include<stdio.h>

int main()
{
	int N;

	scanf("%d",&N);
	
	if(1<=N&&N<=100)
	{
		for(int i=1;i<=N;i++)
		{
			for(int j=0;j<N-i;j++)
				printf(" ");
			for(int j=0;j<i;j++)
				printf("*");
			printf("\n");
		}
	}
}
