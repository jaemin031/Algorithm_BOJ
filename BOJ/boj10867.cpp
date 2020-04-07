#include<stdio.h>

int main()
{
	int N;
	int number[2][2002];
	int value=0;
	int a=0;

	scanf("%d",&N);

	for(int i=-1000;i<=1000;i++)
	{
		number[0][a]=i;
		number[1][a]=0;
		a++;
	}

	while(N!=0)
	{
		scanf("%d",&value);
		for(int i=0;i<=2000;i++)
		{
			if(number[0][i]==value)
			{
				number[1][i]++;
				break;
			}
		}
		N--;
	}
	for(int i=0;i<=2000;i++)
	{
		if(number[1][i]!=0)
			printf("%d ",number[0][i]);
	}

}
