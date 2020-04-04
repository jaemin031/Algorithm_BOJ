#include<stdio.h>

int main()
{
	long long N;
	int F;
	int temp=0;

	scanf("%lld",&N);
	scanf("%d",&F);
	if(N<100||N>2000000000||F>100)
		return 0;
	N=(N/100);
	N=N*100;
	if(N%F==0)
		printf("00");
	else
	{
		for(;temp<100;N++,temp++)
		{
			if(N%F==0)
				break;
		}
		if(temp>9)
			printf("%d",temp);
		else
			printf("0%d",temp);
	}
}
