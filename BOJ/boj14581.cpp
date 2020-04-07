#include<stdio.h>

int main()
{
	char fan[6]=":fan:";
	char id[21];

	scanf("%s",id);

	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
			if(i==1&&j==1)
				printf(":%s:",id);
			else
				printf("%s",fan);
		}
		printf("\n");
	}
}
