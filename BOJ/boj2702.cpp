#include<stdio.h>

int getGCD(int n1,int n2);	//최대 공약수
int getLCM(int n1,int n2);	//최소 공배수

int main()
{
	int T;
	int a,b;

	scanf("%d",&T);
	
	if(T<1||T>1000)
		return 0;

	for(int i=1;i<=T;i++)
	{
		scanf("%d %d",&a,&b);
		
		if(a<1||b<1||a>1000||b>1000)
			return 0;

		printf("%d %d\n",getLCM(a,b),getGCD(a,b));
	}
}

int getGCD(int n1,int n2)
{
	int GCD=0;
	if(n1!=0&&n2!=0)
		for(GCD=n1;n1%GCD||n2%GCD;GCD--);
	return GCD;
}

int getLCM(int n1,int n2)
{
	int LCM=0;
	if(n1!=0&&n2!=0)
		for(LCM=n1;LCM%n1||LCM%n2;LCM++);
	return LCM;
}
