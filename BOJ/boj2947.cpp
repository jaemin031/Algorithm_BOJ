#include<stdio.h>

void print();
int number[6];

int main()
{
	
	int check=1;
	int temp;

	for(int i=1;i<=5;i++)
		scanf("%d",&number[i]);

	while(check!=0)
	{
		check=0;
		for(int i=1;i<=5;i++)
			if(number[i]!=i)
				check=1;

		for(int i=1;i<=4;i++)
			if(number[i]>number[i+1])
			{
				temp=number[i];
				number[i]=number[i+1];
				number[i+1]=temp;
				print();
			}
	}
}


void print()
{
	for(int j=1;j<=5;j++)
		printf("%d ",number[j]);
    printf("\n");
}
