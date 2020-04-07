#include<stdio.h>

int main()
{
	int A=1,B=1;

	while(A!=0&&B!=0)
	{
		scanf("%d %d",&A,&B);
		if(A<=0||A>=10||B<=0||B>=10)
			return 0;
		printf("%d\n",A+B);
	}
}
