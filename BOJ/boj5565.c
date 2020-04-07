#include<stdio.h>

int main()
{
	int sum;
	int a;

	scanf("%d",&sum);

	for(int i=1;i<=9;i++)
	{
		scanf("%d",&a);
		if(a<0||a>10000)
			return 0;
		sum-=a;
	}
	printf("%d\n",sum);
}
