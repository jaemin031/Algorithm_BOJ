#include<stdio.h>

int main()
{
	int n=0;
	int sum=0;
	while(scanf("%d",&n)==1)
	{
		sum+=n;
	}
	printf("%d",sum);
}
