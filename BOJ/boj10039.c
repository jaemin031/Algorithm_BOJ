#include<stdio.h>


int main()
{
	int a;
	int sum=0;



	for(int i=1;i<=5;i++)
	{
		scanf("%d",&a);
		if(0<=a&&a<=100&&a%5==0)
		{
			if(a<40)
				a=40;
			sum+=a;
		}
		else
			break;
	}
	printf("%d",sum/5);
	
}
