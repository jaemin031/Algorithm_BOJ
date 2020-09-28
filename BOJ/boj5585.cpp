#include<stdio.h>

int main()
{
	int count=0;
	int N;
	int c=0;

	scanf("%d",&N);

	if(1<=N&&N<=1000)
	{
		c=1000-N;

		if(c>=500)
		{
			count+=c/500;
			c=c%500;
		}
		if(c>=100)
		{
			count+=c/100;
			c=c%100;
		}
		if(c>=50)
		{
			count+=c/50;
			c=c%50;
		}
		if(c>=10)
		{
			count+=c/10;
			c=c%10;
		}
		if(c>=5)
		{
			count+=c/5;
			c=c%5;
		}
		if(c!=0)
			count+=c;
		printf("%d",count);
	}
}
