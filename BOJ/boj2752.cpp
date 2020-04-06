#include<stdio.h>

int main()
{
	int n[4];
	int temp;
	for(int i=0;i<3;i++)
		scanf("%d",&n[i]);

	for(int i=0;i<2;i++)
		for(int j=i+1;j<3;j++)
			if(n[i]>n[j])
			{
				temp=n[i];
				n[i]=n[j];
				n[j]=temp;
			}

	for(int i=0;i<3;i++)
		printf("%d ",n[i]);
}
