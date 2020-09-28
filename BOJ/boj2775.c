#include<stdio.h>

int number[15];

int main()
{
	int T;
	int k;
	int n;
	

	scanf("%d",&T);

	for(int tc=1;tc<=T;tc++)
	{
		scanf("%d",&k);
		scanf("%d",&n);
		for(int i=1;i<=14;i++)
			number[i]=i;
		for(int c=1;c<=k;c++)
		{
			for(int i=1;i<=14;i++)
			{
				
				if(i==1)
					number[i]=1;
				else if(i==2)
					number[i]=1+number[i];
				else
					number[i]=number[i]+number[i-1];
				
			}
		}
		printf("%d\n",number[n]);
	}
}
