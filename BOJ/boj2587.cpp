#include<stdio.h>

int main()
{
	int num[6];
	int i;
	int sum=0;
	int temp=0;

	for(i=1;i<=5;i++){
		scanf("%d",&num[i]);
		sum+=num[i];
	}

	for(i=1;i<=4;i++)
		for(int j=i+1;j<=5;j++)
			if(num[i]>num[j]){
				temp=num[j];
				num[j]=num[i];
				num[i]=temp;
			}

	printf("%d\n",sum/5);
	printf("%d",num[3]);




}
