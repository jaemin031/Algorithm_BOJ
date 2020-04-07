#include<stdio.h>

int main()
{
	int T;
	int num[6];
	int i=0;
	scanf("%d",&T);

	while(T!=0)
	{
		num[i]=T%9;
		T=T/9;
		i++;
	}
	for(i=i-1;i>=0;i--)
		printf("%d",num[i]);
}
