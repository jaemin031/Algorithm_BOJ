#include<stdio.h>

int coef(int n);

int main()
{
	int N;
	int K;

	scanf("%d %d",&N, &K);

	if(1<=N&&N<=10&&0<=K&&K<=N)
	{
		printf("%d",coef(N)/(coef(K)*coef(N-K)));
	}
}

int coef(int n)
{
	int number=1;

	for(int i=1;i<=n;i++)
		number*=i;
	return number;
}
