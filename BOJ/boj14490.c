#include<stdio.h>
#include<string.h>

int main()
{
	char vl[22];
	int n=0;
	int m=0;
	int co=0;
	int min=0;
	scanf("%s",vl);

	for(int i=0;i<strlen(vl);i++)
	{
		if(vl[i]==':')
			co++;
		else
		{
			if(co==0)
			{
				n*=10;
				n+=vl[i]-48;
			}
			else
			{
				m*=10;
				m+=vl[i]-48;
			}
		}
	}

	while(min!=1)
	{
		if(m>n)
			min=n;
		else
			min=m;
		for(int i=min;i>0;i--)
		{
			if(m%i==0&&n%i==0)
			{
				min=i;
				break;
			}
		}
		m=m/min;
		n=n/min;
	}
	printf("%d:%d",n,m);
}
