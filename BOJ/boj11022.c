#include<stdio.h>


int main()
{
	int X,A,B;

	scanf("%d",&X);

	for(int i=1;i<=X;i++)
	{
		scanf("%d %d",&A,&B);
		if(0<A&&B<10)
			printf("Case #%d: %d + %d = %d\n",i,A,B,A+B);
	}
}
