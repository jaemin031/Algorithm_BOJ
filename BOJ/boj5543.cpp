#include<stdio.h>

int main()
{
	int sell[6];
	int value=0;
	int min=2001;
	
	for(int i=0;i<5;i++)
	{
		scanf("%d",&sell[i]);
		if(sell[i]<100||sell[i]>2000)
			return 0;
		if(i<3)
		{
			if(min>sell[i])
				min=sell[i];
		}
		else if(i==3)
		{
			value+=min;
			min=sell[i];
		}
		else
			if(min>sell[i])
				min=sell[i];
	}
	printf("%d",value+min-50);
}
