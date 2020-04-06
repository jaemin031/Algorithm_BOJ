#include<stdio.h>

int main()
{
	int N[10];
	int sum=0;
	int max[5];
	int point=1;
	int temp=0;

	for(int i=1;i<=8;i++)
	{
		scanf("%d",&N[i]);
		if(0>N[i]||N[i]>150)
			return 0;
		for(int j=i-1;j>=1;j--)
		{
			if(N[j]==N[i])
				return 0;
		}
	}

	for(int i=0;i<5;i++)
	{
		point=1;
		temp=0;
		for(int j=1;j<=8;j++)
		{
			if(temp<N[j])
			{
				temp=N[j];
				point=j;
			}

		}
		sum+=temp;
		N[point]=0;
		max[i]=point;
	}

	for(int i=0;i<4;i++)
	{
		temp=0;
		for(int j=i+1;j<=4;j++)
		{
			if(max[i]>max[j])
			{
				temp=max[j];
				max[j]=max[i];
				max[i]=temp;
			}
		}
	}
	printf("%d\n",sum);
	for(int i=0;i<5;i++)
		printf("%d ",max[i]);

}
