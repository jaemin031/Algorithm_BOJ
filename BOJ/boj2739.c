#include<stdio.h>

int main()
{
	int N;

	scanf("%d",&N);

	if(N>=1&&N<=9)
	{
		for(int i=1;i<=9;i++)
		{
			printf("%d * %d = %d\n",N,i,N*i);
		}
	}
}
