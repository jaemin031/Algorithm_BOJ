#include<stdio.h>

int main()
{
	int number;
	int sum=0;
	int min=100;

	for(int i=1;i<=7;i++)
	{
		scanf("%d",&number);
		if(number>=100||number<0)
			return 0;
		else if(number%2!=0)
		{
			sum+=number;
			if(number<min)
				min=number;
		}
	}
	if(sum!=0)
	{
		printf("%d\n",sum);
		printf("%d",min);
	}
	else
		printf("-1");
}
