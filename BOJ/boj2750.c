#include<stdio.h>


int main()
{
	int N;
	int Number[1001];
	int temp=0;
	int p;

	scanf("%d",&N);
	if(1<=N<=1000);
	{
		for(int i=1;i<=N;i++)
		{
			scanf("%d",&Number[i]);
			if(!(-1000<=Number[i]&&Number[i]<=1000))
				return 0;
		}
	
		for(int i=1;i<=N;i++)
		{
			temp=1001;
			p=0;
			for(int j=i;j<=N;j++)
			{
				if(Number[j]<temp)
				{
					temp=Number[j];
					p=j;
				}
				else if(Number[j]==temp)
					return 0;
			}
			Number[p]=Number[i];
			Number[i]=temp;
		}
		for(int i=1;i<=N;i++)
			printf("%d\n",Number[i]);
	}
}
