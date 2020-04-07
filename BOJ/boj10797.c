#include<stdio.h>

int main()
{
	int day;
	int car;
	int count=0;

	scanf("%d",&day);
	if(day>9)
		return 0;
	for(int i=1;i<=5;i++)
	{
		scanf("%d",&car);
		if(car>9)
			return 0;
		if(car==day)
			count++;
	}
	printf("%d",count);
}
