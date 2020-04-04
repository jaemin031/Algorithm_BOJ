#include<stdio.h>

int main()
{
	int A[51];
	int B[51];
	int N;
	int temp=0;
	int sum=0;
	scanf("%d",&N);
	if(N>50)
		return 0;

	for(int i=1;i<=2;i++)
	{
		for(int j=1;j<=N;j++)
		{
			if(i==1)
			{
				scanf("%d",&A[j]);
				if(A[j]<0||A[j]>100)
					return 0;
			}
			else if(i==2)
			{
				scanf("%d",&B[j]);
				if(B[j]<0||B[j]>100)
					return 0;
			}
		}

	}

	for(int i=1;i<N;i++)
	{

		for(int j=i;j<N;j++)
		{
			if(A[i]<A[j+1])
			{
				temp=A[i];
				A[i]=A[j+1];
				A[j+1]=temp;
			}
		}

	}
	for(int i=1;i<N;i++)
	{

		for(int j=i;j<N;j++)
		{
			if(B[i]>B[j+1])
			{
				temp=B[i];
				B[i]=B[j+1];
				B[j+1]=temp;
			}
		}

	}
	for(int i=1;i<=N;i++)
	{
		sum+=A[i]*B[i];
	}
	printf("%d",sum);
}
