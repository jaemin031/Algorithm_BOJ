#include<stdio.h>

int main()
{
	int number[4];
	int temp=0;
	char spel[4];


	scanf("%d %d %d",&number[0],&number[1],&number[2]);

	for(int i=1;i<=2;i++)
	{
		if(number[0]>number[i])
		{
			temp=number[i];
			number[i]=number[0];
			number[0]=temp;
		}
	}
	if(number[1]>number[2])
	{
		temp=number[2];
		number[2]=number[1];
		number[1]=temp;
	}

	scanf("%s",spel);
	
	for(int i=0;i<=2;i++)
	{
		printf("%d ",number[(int)spel[i]-65]);
	}

}
