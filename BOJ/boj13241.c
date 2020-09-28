#include<stdio.h>

long long int getGCD(long long int n1,long long int n2);
long long int getLCM(long long int n1,long long int n2);
int main()
{
	long long int a,b;

	scanf("%lld %lld",&a,&b);

	printf("%lld",getLCM(a,b));
}

long long int getGCD(long long int n1,long long int n2)
{
	long long int GCD;
	if(n1!=0&&n2!=0)
		for(GCD=n1;n1%GCD||n2%GCD;GCD--);
	return GCD;
}

long long int getLCM(long long int n1,long long int n2)
{
	return (n1*n2)/getGCD(n1,n2);
}
