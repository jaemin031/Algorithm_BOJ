#include<stdio.h>

int main()
{
	int A,B;
	int max=0;
	int sum=0;

	for(int i=1;i<=10;i++)
	{
		scanf("%d %d",&A,&B);
		if(i==1&&A!=0)
			return 0;
		if(i==10&&B!=0)
			return 0;
		if(sum>10000)
			return 0;

		sum=sum-A+B;
		if(max<sum)
			max=sum;
	}
	printf("%d",max);
}
