#include<stdio.h>

int main()
{
	int al[7]={1,1,2,2,2,8};
	int j[7];

	for(int i=0;i<6;i++)
		scanf("%d",&j[i]);
	for(int i=0;i<6;i++)
	{
		printf("%d ",al[i]-=j[i]);
	}
}
