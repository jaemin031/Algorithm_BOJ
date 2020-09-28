#include<stdio.h>

int main()
{
	int number[1001];
	int N;
	int K;
	int count=1;
	int temp=2;
	int temp_=2;

	scanf("%d %d",&N,&K);

	for(int i=3;i<=N;i++)
		number[i]=i;

	while(count!=N)
	{
		for(int i=3;i<=N;i++)
			if(number[i]!=0&&number[i]!=NULL&&number[i]%temp==0)
			{
				temp_=number[i];
				number[i]=0;
				count++;
				if(K==count)
					break;
			}

		if(K==count)
			break;
		
		for(int i=3;i<=N;i++)
			if(number[i]!=0&&number[i]!=NULL)
			{
				temp_=number[i];
				temp=number[i];
				number[i]=0;
				count++;
				break;
			}
		if(K==count)
			break;
	}
	printf("%d",temp_);

}
