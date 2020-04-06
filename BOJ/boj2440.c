#include<stdio.h>

int main()
{
	int n;

	scanf("%d",&n);

	if(1<=n&&n<=100)
	{
		for(int i=n;i>=1;i--)
		{
			for(int j=i;j>=1;j--)
			{
				printf("*");
			}
			printf("\n");
		}
	}
}
