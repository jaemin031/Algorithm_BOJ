#include<stdio.h>

int main()
{
	int N;
	int max=-1000001;
	int min=1000001;
	int temp;

	scanf("%d",&N);

	for(int i=1;i<=N;i++)
	{
		scanf("%d",&temp);
		if(temp>max)
			max=temp;
		if(temp<min)
			min=temp;
	}
	printf("%d %d",min,max);
}
