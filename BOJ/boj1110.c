#include<stdio.h>

int main()
{
	int N;
	int a,b;
	int d=0;
	int count=0;
	int temp=0;
	int c=0;
	int check=1;
	scanf("%d",&N);

	if(0<=N&&N<=99)
	{
		d=N;
		while(1)
		{
			if(d<10)
			{
				a=0;
				b=d%10;
	
			}
			else
			{
				a=d/10;
				b=d%10;
			}
			c=a+b;
			d=(b*10)+(c%10);
			count++;
			if(d==N)
				break;
		}
		printf("%d",count);
	}
}
