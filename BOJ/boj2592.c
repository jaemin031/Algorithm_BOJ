#include<stdio.h>

int main()
{
	int number[11];
	int sum=0;
	int avg=0;
	int count[11];
	int max=0;
	int point;

	for(int i=1;i<=10;i++)
		count[i]=0;
	for(int i=1;i<=10;i++)
	{
		scanf("%d",&number[i]);
		if(number[i]>1000||number[i]%10!=0)
			return 0;
		sum+=number[i];
	}
	avg=sum/10;

	for(int i=1;i<=10;i++)
	{
		for(int j=i;j<=10;j++)
		{
			if(number[i]==number[j])
				count[i]++;
		}
	}

	for(int i=1;i<=10;i++)
	{
		if(max<count[i])
		{
			max=count[i];
			point=i;
		}
	}



	printf("%d\n%d",avg,number[point]);


}
