#include<stdio.h>

int main()
{
	int X;
	int count=1;
	int stic=0;
	int havestic[10]={0,64,0,0,0,0,0,0,0,0};
	int sum=0;
	int sum2=0;
	scanf("%d",&X);

	if(0<=X&&X<=64)
	{
		while(sum!=X)
		{
			sum=0;
			for(int i=1;i<=count;i++)
				sum+=havestic[i];
			if(sum>X)
			{
				havestic[count+1]=havestic[count]/2;
				havestic[count]=havestic[count]/2;
				sum2=0;
				for(int i=1;i<=count;i++)
					sum2+=havestic[i];
				if(sum2>=X)
					havestic[count]=0;
				count++;
			}
			
		}
		for(int i=0;i<10;i++)
		{
			if(havestic[i]!=0)
				stic++;
		}
		printf("%d",stic);

	}


}
