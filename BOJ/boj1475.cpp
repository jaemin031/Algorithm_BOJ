#include<stdio.h>

int main()
{
	char N[8];
	int number[10];
	int max=0;
	int sum=0;

	scanf("%s",N);
	
	for(int i=0;i<=9;i++)
		number[i]=0;

	for(int i=0;i<=8&&N[i]!=NULL;i++)
	{
		number[N[i]-48]++;
	}

	sum=number[6]+number[9];

	if(sum%2==0)
	{
		number[6]=sum/2;
		number[9]=sum/2;
	}
	else
	{
		number[6]=sum/2+1;
		number[9]=sum/2+1;
	}

	for(int i=0;i<=9;i++)
	{
		if(max<number[i])
			max=number[i];
	}

	printf("%d",max);

}
