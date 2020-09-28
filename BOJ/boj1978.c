#include<stdio.h>

int so(int n);

int main()
{
	int N;
	int A;
	int count=0;
	scanf("%d",&N);

	if(N<=100)
	{
		for(int i=0;i<N;i++)
		{
			scanf("%d",&A);
			if(A>1000)
				return 0;
			if(so(A)==0)
				count++;
		}
		printf("%d",count);
	}
}

int so(int n)
{
	int check=0;

	for(int j=2;j<n;j++)
	{
		if(n%j==0)
			check=1;
	}
	if(check==1||n==1)
		return 1;
	else
		return 0;
}
