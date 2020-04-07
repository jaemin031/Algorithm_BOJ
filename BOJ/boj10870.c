#include<stdio.h>

int fib(int n);

int main()
{
	int n;
	scanf("%d",&n);
	if(n>20)
		return 0;
	printf("%d",fib(n));
}

int fib(int n)
{
	if(n==0)
		return 0;
	if(n==1)
		return 1;
	else
		return fib(n-1)+fib(n-2);
}
