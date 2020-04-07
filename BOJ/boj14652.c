#include<stdio.h>

int main()
{
	int N,M;
	int c=0;
	int K;

	scanf("%d %d %d",&N,&M,&K);
	if(N<1||M<1||N>30000||M>30000||K<1||K>(N*M)-1)
		return 0;

	for(int i=0;i<N;i++)
	{
		for(int j=0;j<M;j++)
		{	
			if(c==K)
			{
				printf("%d %d",i,j);
			}
			c++;
		}
	}

}
