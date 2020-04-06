#include<stdio.h>

int main()
{
	int N,M;

	scanf("%d %d",&N,&M);

	if(1<=N&&N<=300&&1<=M&&M<=300)
		printf("%d",N*M-1);

}
