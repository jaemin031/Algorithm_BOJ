#include<stdio.h>

int main()
{
	int point[6]={0,0,0,0,0,0};
	int c=0;
	int max=0;
	int number=0;
	int value=0;
	for(int i=1;i<=5;i++)
	{
		value=0;
		for(int j=1;j<=4;j++)
		{
			scanf("%d",&c);
			value+=c;
		}
		point[i]=value;
	}
	for(int i=1;i<=5;i++)
	{
		if(max<point[i])
		{
			max=point[i];
			number=i;
		}
	}
	printf("%d %d",number,max);
}
