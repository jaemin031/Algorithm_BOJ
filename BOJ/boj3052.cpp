#include<stdio.h>

int main()
{
	int number[11];
	int count=0;

	for(int i=1;i<=10;i++)
	{
		scanf("%d",&number[i]);
		if(number[i]<0||number[i]>1000)
			return 0;
		number[i]=number[i]%42;
	}

	for(int i=1;i<=10;i++)
	{
		count++;
		for(int j=i+1;j<=10;j++)
		{
			if(number[i]==number[j])
			{
				count--;
				break;
			}
		}
	}

	printf("%d",count);
}
