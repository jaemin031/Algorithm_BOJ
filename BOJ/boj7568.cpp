#include<stdio.h>

struct m{
	int x,y,l;
}M[51];

int main()
{
	int N;

	scanf("%d",&N);

	for(int i=0;i<N;i++)
		scanf("%d %d",&M[i].x,&M[i].y);

	for(int i=0;i<N;i++)
	{
		M[i].l=1;
		for(int j=0;j<N;j++)
		{
			if(M[i].x<M[j].x&&M[i].y<M[j].y)
				M[i].l++;
		}
	}
	
	for(int i=0;i<N;i++)
		printf("%d ",M[i].l);
}
