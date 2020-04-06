#include<stdio.h>

int main()
{
	int A,B,C,D;
	

	scanf("%d %d %d",&A,&B,&C);
	scanf("%d",&D);
	
	B+=A*60;
	A=0;
	C+=B*60;
	B=0;
	C+=D;
	C=C%86400;

	B=C/60;
	C=C%60;
	A=B/60;
	B=B%60;

	printf("%d %d %d",A,B,C);
}
