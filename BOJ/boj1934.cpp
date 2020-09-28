#include<stdio.h>

int getLCM(int n1,int n2);

int main()
{
	int T;
	int A,B;
	scanf("%d",&T);

	while(T!=0)
	{
		scanf("%d %d",&A,&B);
		if(A<1||B<1||A>45000||B>45000)
			return 0;
		printf("%d\n",getLCM(A,B));
		T--;
	}
}

int getLCM(int n1,int n2)
{
	int GCD=0;
	if(n1!=0&&n2!=0)
		for(GCD=n1;n1%GCD||n2%GCD;GCD--);
	return (n1*n2)/GCD;
}
