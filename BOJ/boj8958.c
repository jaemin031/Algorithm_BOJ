#include<stdio.h>

int main()
{
	int N;
	char OX[81];
	int sum=0;
	int count=0;
	scanf("%d",&N);

	for(int t=0;t<N;t++)
	{
		sum=0;
		for(int i=0;i<81;i++)
		{
			OX[i]='N';
		}
		scanf("%s",OX);

		for(int i=0;OX[i]!='N';i++)
		{
			if(OX[i]=='O')
			{
				count++;
			}
			else
				count=0;
			sum=sum+count;
		}
		printf("%d\n",sum);
		
	}
}
