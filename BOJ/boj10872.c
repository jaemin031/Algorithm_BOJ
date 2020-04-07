#include<stdio.h>


int fat(int n);

int main()
{
	int N;

	scanf("%d",&N);

	if(0<=N&&N<=12)
	{
		printf("%d",fat(N));
	}
}

int fat(int n)
{
	if(n>=2)
		return n*fat(n-1);
	else
		return 1;
}
