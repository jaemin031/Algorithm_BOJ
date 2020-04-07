#include<stdio.h>

int main()
{
	long long int tai[81];
	int N;
	long long int line=0;

	tai[0]=1;
	tai[1]=1;
	for(int i=2;i<=80;i++)
	{
		tai[i]=tai[i-2]+tai[i-1];
	}
	scanf("%d",&N);

	if(1<=N&&N<=80)
	{
		if(N==0)
			line=0;
		else if(N==1)
			line=4;
		else if(N==2)
			line=6;
		else if(N==3)
			line=10;
		else
		{
			line=(tai[N-4])+(2*tai[N-3])+(2*tai[N-2])+(3*tai[N-1]);
		}
		printf("%lld",line);
	}
}
