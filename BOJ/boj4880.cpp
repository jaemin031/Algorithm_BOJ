#include<stdio.h>

int main()
{
	int a1,a2,a3;
	int temp1,temp2=0;

	while(1)
	{
		temp1,temp2=0;
		scanf("%d %d %d",&a1,&a2,&a3);
		if(a1==0&&a2==0&&a3==0)
			break;
		temp1=a2-a1;
		temp2=a3-a2;
		if(temp1==temp2)
			printf("AP %d\n",a3+temp1);
		else
		{
			temp1=a2/a1;
			printf("GP %d\n",a3*temp1);
		}
	}
}
