#include<stdio.h>

int main()
{
	int N,M;
	int number[301][301];
	int sum=0;
	int k;
	int i,j,x,y;

	scanf("%d %d",&N,&M);
	if(N<1||M<1||N>300||M>300)
		return 0;
	for(int a=1;a<=N;a++)
	{
		for(int b=1;b<=M;b++)
			scanf("%d",&number[a][b]);
	}
	scanf("%d",&k);	
	if(k<1||k>10000)
		return 0;
	for(int c=1;c<=k;c++)
	{
		sum=0;
		scanf("%d %d %d %d",&i,&j,&x,&y);		
		if(i>x||j>y)
			return 0;
		for(int a=i;a<=x;a++)
		{
			for(int b=j;b<=y;b++)
				sum+=number[a][b];
		}
		printf("%d\n",sum);
	}
}
