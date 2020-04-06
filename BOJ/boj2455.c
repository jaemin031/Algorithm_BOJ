#include<stdio.h>

int main()
{
	int a,b=0;
	int sum=0;
	int max=0;
	for(int i=0;i<4;i++)
	{
		scanf("%d %d",&a,&b);
		if(sum>10000)
		{
			printf("10000");
		}
		if(i==0&&a!=0)
			break;
		if(sum<a)
			break;
		if(i==3&&b!=0)
			break;
		sum=sum-a+b;

		if(max<sum)
			max=sum;
	}
	printf("%d",max);
}
