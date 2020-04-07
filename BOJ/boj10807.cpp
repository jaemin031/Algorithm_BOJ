#include<stdio.h>

int main()
{
	int N;
	int count=0;
	int v;
	int t[101];

	scanf("%d",&N);
	for(int i=1;i<=N;i++)
		scanf("%d",&t[i]);

	scanf("%d",&v);

	for(int i=1;i<=N;i++)
		if(v==t[i])
			count++;

	printf("%d",count);
}
