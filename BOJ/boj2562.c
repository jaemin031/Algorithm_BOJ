#include<stdio.h>

int main()
{
	int N[10];
	int max=0;
	int point=0;

	for(int i=1;i<10;i++)
	{
		scanf("%d",&N[i]);
		if(N[i]>=100)
			return 0;

		if(max<N[i])
		{
			max=N[i];
			point=i;
		}
	}

	printf("%d\n",max);
	printf("%d",point);

	
}
