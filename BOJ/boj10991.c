#include<stdio.h>

int main()
{
	int n;
	scanf("%d",&n);

	if(n<1||n>100)
		return 0;

	for(int i=1;i<=n;i++)
	{
		for(int j=n;j>i;j--)
			printf(" ");
		for(int k=i;k>=1;k--)
			printf("* ");


		printf("\n");
	}
}
