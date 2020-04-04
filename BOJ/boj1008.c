#include<stdio.h>

int main()
{
	int A;
	int B;

	scanf("%d %d",&A,&B);
	
	if(A>0&&B<10)
	{
		printf("%.9lf",(double)A/(double)B);
	}
}
