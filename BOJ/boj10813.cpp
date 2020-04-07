#include<stdio.h>

int main()
{
	int M,N;
	int bl[101];
	int temp=0;
	int i,j;

	scanf("%d %d",&N,&M);

	for(int p=1;p<=N;p++)
		bl[p]=p;

	for(int p=1;p<=M;p++)
	{
		scanf("%d %d",&i,&j);
		temp=bl[i];
		bl[i]=bl[j];
		bl[j]=temp;
	}
	for(int p=1;p<=N;p++)
		printf("%d ",bl[p]);
}
