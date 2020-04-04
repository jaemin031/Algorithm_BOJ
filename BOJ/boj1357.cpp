#include<stdio.h>

int rev(int n);

int main()
{
	int X;
	int Y;

	scanf("%d %d",&X,&Y);

	if(X>1000||Y>1000)
		return 0;
	printf("%d",rev(rev(X)+rev(Y)));
}

int rev(int n)
{
	int a,b,c,d=0;
	if(n>=1000)
	{
		a=n/1000;
		b=(n-(a*1000))/100;
		c=(n-(a*1000)-(b*100))/10;
		d=n%10;
		return d*1000+c*100+b*10+a;
	}
	else if(n<1000&&n>=100)
	{
		b=n/100;
		c=(n-(b*100))/10;
		d=n%10;
		return d*100+c*10+b;
	}
	else if(n<100&&n>=10)
	{
        c=n/10;
        d=n%10;
		return d*10+c;
	}
	else
		return n;
}
