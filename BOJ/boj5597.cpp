#include<stdio.h>

int main()
{
	int std[31]={0,};
	int s;

	for(int i=1;i<=28;i++)
	{
		scanf("%d",&s);
		std[s]=1;
	}

	for(int i=1;i<=30;i++)
	{
		if(std[i]==0)
			printf("%d\n",i);
	}
}
