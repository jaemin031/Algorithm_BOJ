#include<stdio.h>

int main()
{
	int A,B;

	scanf("%d %d",&A,&B);

	if(1<=A&&A<=10000&&1<=B&&B<=10000)
	{
		printf("%d\n",A+B);
		printf("%d\n",A-B);
		printf("%d\n",A*B);
		printf("%d\n",A/B);
		printf("%d\n",A%B);
	}
}
