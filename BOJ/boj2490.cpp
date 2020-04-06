#include<stdio.h>

int main()
{
	int num[3];
	int temp=0;
	int sum=0;

	for(int i=0;i<3;i++)
	{
		for(int j=0;j<4;j++)
		{
			scanf("%d",&temp);
			sum+=temp;
		}
		num[i]=sum;
		sum=0;
	}
	for(int i=0;i<3;i++)
	{
		if(num[i]==4)
			printf("E\n");
		else if(num[i]==3)//도=0->1
			printf("A\n");
		else if(num[i]==2)//개=0->2
			printf("B\n");
		else if(num[i]==1)//걸=0->3
			printf("C\n");
		else if(num[i]==0)//윷=0->4
			printf("D\n");
	}
}
