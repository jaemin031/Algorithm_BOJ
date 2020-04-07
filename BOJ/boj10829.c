#include<stdio.h>

int main()
{
	long long n;
	long long number[50];
	int i=0;

	scanf("%lld",&n);

	while(1)
	{

		if(n%2==0)
		{
			number[i]=0;
			i++;
			n=n/2;
		}
		else
		{
			number[i]=1;
			i++;
			n=(n-1)/2;
		}
		if(n==0)
			break;
	}

	for(i=i-1;i>=0;i--)
		printf("%lld",number[i]);
}
