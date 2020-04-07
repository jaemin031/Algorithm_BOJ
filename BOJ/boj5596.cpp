#include<stdio.h>

int main()
{
	int A[5];
	int B[5];
	int SUM_A;
	int SUM_B;

	scanf("%d %d %d %d",&A[0],&A[1],&A[2],&A[3]);
	scanf("%d %d %d %d",&B[0],&B[1],&B[2],&B[3]);
	SUM_A=A[0]+A[1]+A[2]+A[3];
	SUM_B=B[0]+B[1]+B[2]+B[3];

	if(SUM_A>=SUM_B)
		printf("%d",SUM_A);
	else
		printf("%d",SUM_B);

}
