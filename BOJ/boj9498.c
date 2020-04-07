#include<stdio.h>

int main()
{
	int N;

	scanf("%d",&N);

	if(0<=N&&N<=100)
	{
		if(90<=N&&N<=100)
			printf("A");
		else if(80<=N&&N<=89)
			printf("B");
		else if(70<=N&&N<=79)
			printf("C");
		else if(60<=N&&N<=69)
			printf("D");
		else
			printf("F");
	}
}
