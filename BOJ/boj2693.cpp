#include<stdio.h>

int main()
{
	int dap[1001]={0,};
	int ind[11];
	int tc;
	int temp;

	scanf("%d",&tc);

	for(int j=1;j<=tc;j++)
	{
		for(int i=1;i<=10;i++)
			scanf("%d",&ind[i]);

		for(int a=1;a<10;a++)
			for(int b=a+1;b<=10;b++)
				if(ind[a]>ind[b])
				{
					temp=ind[a];
					ind[a]=ind[b];
					ind[b]=temp;
				}

		dap[j]=ind[8];
	}
	for(int j=1;j<=tc;j++)
		printf("%d\n",dap[j]);
}
