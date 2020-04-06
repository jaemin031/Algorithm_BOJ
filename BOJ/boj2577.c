#include<stdio.h>

int main()
{
	int N;
	int A,B,C;
	int count[11];
	int Number[11];
	int j=1000000000;
	int p;
	scanf("%d",&A);
	scanf("%d",&B);
	scanf("%d",&C);

	for(int i=1;i<11;i++)
	{
		count[i]=0;
	}
	if(100<=A&&A<=1000&&100<=B&&B<=1000&&100<=C&&C<=1000)
	{
		N=A*B*C;

		for(int i=0;i<11&&j!=0;i++,j=j/10)
		{
			Number[i+1]=(N/j)%10;
		}
		for(int i=1;i<11;i++)
		{
			if(Number[i]!=0)
			{
				p=i;
				break;
			}
		}
		for(;p<11;p++)
		{
			count[Number[p]+1]++;
		}
		for(int i=1;i<11;i++)
		{
			printf("%d\n",count[i]);
		}
	}
}
