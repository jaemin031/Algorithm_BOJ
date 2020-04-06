#include<stdio.h>

int main()
{
	int key[10];
	int temp=0;
	int a,b;
	int sum=0;

	for(int i=1;i<=9;i++)
	{
		scanf("%d",&key[i]);
		if(key[i]<0||key[i]>100)
			return 0;
		sum+=key[i];
	}

	for(int i=1;i<=9;i++)
	{
		temp=0;
		for(int j=i;j<=9;j++)
		{
			if(key[i]>key[j])
			{
				temp=key[i];
				key[i]=key[j];
				key[j]=temp;
			}
		}
	}
	for(int i=1;i<=9;i++)
	{
		for(int j=1;j<=9;j++)
		{
			if(i==j)
				continue;
			if(sum-key[i]-key[j]==100)
			{
				a=key[i];
				b=key[j];
			}
		}
	}
	for(int i=1;i<=9;i++)
	{
		if(key[i]!=a&&key[i]!=b)
			printf("%d\n",key[i]);
	}
}
