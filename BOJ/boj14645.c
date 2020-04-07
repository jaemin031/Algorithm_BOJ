#include<stdio.h>

int main()
{
	int N;
	int K;
	int A;
	int B;
	int g=1;
	scanf("%d %d",&N,&K);

	if(1<=N&&N<=100000&&1<=K&&K<=10000)
	{
		for(int j=1;j<=N;j++)
		{
			scanf("%d %d",&A,&B);
			if(!(0<=A&&B<=10000))
				g=2;
		}
		if(g==1)
			printf("비와이");
	}
	
}
