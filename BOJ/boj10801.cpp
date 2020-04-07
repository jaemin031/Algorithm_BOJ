#include<stdio.h>

int main()
{
	int A[11];
	int B[11];
	int count_A=0;
	int count_B=0;

	for(int i=0;i<=9;i++)
	{
		scanf("%d",&A[i]);
	}
	for(int i=0;i<=9;i++)
	{
		scanf("%d",&B[i]);
	}

	for(int i=0;i<=9;i++)
	{
		if(A[i]>B[i])
			count_A++;
		else if(A[i]<B[i])
			count_B++;
	}
	if(count_A>count_B)
		printf("A");
	else if(count_A<count_B)
		printf("B");
	else
		printf("D");
}
