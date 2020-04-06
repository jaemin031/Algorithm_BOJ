#include<stdio.h>

int main()
{
	int N,M;
	int A[101][101];
	int B[101][101];
	scanf("%d %d",&N,&M);

	if(1<=N&&N<=100&&1<=M&&M<=100)
	{
		for(int i=1;i<=N;i++)
		{
			for(int j=1;j<=M;j++)
			{
				scanf("%d",&A[i][j]);
				if(A[i][j]<-100||A[i][j]>100)
					return 0;
			}
		}
		for(int i=1;i<=N;i++)
		{
			for(int j=1;j<=M;j++)
			{
				scanf("%d",&B[i][j]);
				if(B[i][j]<-100||B[i][j]>100)
					return 0;
			}
		}

		for(int i=1;i<=N;i++)
		{
			for(int j=1;j<=M;j++)
			{
				printf("%d ",A[i][j]+B[i][j]);
			}
			printf("\n");
		}

	}
}
