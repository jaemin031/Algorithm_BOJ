#include<stdio.h>

int main()
{
	int stand[101];
	int N;
	int count=0;
	int T;

	scanf("%d",&N);
	
	if(N>100)
		return 0;

	for(int i=1;i<=100;i++)
		stand[i]=0;

	for(int i=1;i<=N;i++)
	{
		scanf("%d",&T);
		if(stand[T]==0)
			stand[T]=1;
		else
			count++;
	}
	printf("%d",count);

}
