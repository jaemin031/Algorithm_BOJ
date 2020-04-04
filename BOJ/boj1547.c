#include<stdio.h>

int main()
{
	int M;
	int temp;
	int A,B;

	int cup[4]={0,1,0,0};

	scanf("%d",&M);

	if(1<=M&&M<=50)
	{
		for(int i=1;i<=M;i++)
		{
			scanf("%d %d",&A,&B);
			temp=cup[B];
			cup[B]=cup[A];
			cup[A]=temp;
		}

		for(int i=1;i<4;i++)
		{
			if(cup[i]==1)
				printf("%d",i);
		}
	}
}
