#include<stdio.h>

int main()
{
	int n=0;
	
	while(1)
	{
		scanf("%d",&n);
		if(n==-1)
			break;
		int sum=0;

		for(int i=1;i<n;i++)
			if(n%i==0)
				sum+=i;
		if(sum==n)
		{
			printf("%d = ",n);
			for(int i=1;i<n;i++)
			{
				if(i==1)
					printf("%d",i);
				else if(n%i==0)
					printf(" + %d",i);
			}
			printf("\n");
		}
		else
			printf("%d is NOT perfect.\n",n);
	}

}
