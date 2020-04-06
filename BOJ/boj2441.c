#include<stdio.h>

int main()
{
	int N;

	scanf("%d",&N);
	if(N>=1&&N<=100)
	{
		for(int i=0;i<N;i++)
		{
			for(int j=0;j<N;j++)
			{
				if(i>j)
				{
					printf(" ");
				}
				else
				{
					printf("*");
				}
			}
			printf("\n");
		}
	}

}
