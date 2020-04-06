#include<stdio.h>

int main()
{
	int C;
	int N;
	int std[1001];
	int sum=0;
	int avg=0;
	int count=0;

	scanf("%d",&C);

	for(int i=0;i<C;i++)
	{
		sum=0;
		avg=0;
		count=0;
		for(int j=0;j<1000;j++)
		{
			std[j]=-1;
		}
		scanf("%d",&N);
		if(1<=N&&N<=1000)
		{
			for(int j=0;j<N;j++)
			{
				scanf("%d",&std[j]);
				if(0<=std[j]&&std[j]<=100)
					sum+=std[j];
				else
					return 0;
			}
		}
		else
			return 0;

		avg=sum/N;
		for(int j=0;j<N;j++)
		{
			if(std[j]>avg)
				count++;
		}
		printf("%0.3f%%\n",(float)count/(float)N*100);
	}
}
