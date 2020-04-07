#include<stdio.h>

int main()
{
	int A,B,C;
	scanf("%d %d %d",&A,&B,&C);

	if(1<=A&&A<=100&&1<=B&&B<=100&&1<=C&&C<=100)
	{
		if((B<=A&&A<=C)||C<=A&&A<=B)
			printf("%d",A);
		else if((A<=B&&B<=C)||(C<=B&&B<=A))
			printf("%d",B);
		else
			printf("%d",C);
	}
}
