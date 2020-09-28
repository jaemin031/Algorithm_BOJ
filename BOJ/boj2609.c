#include<stdio.h>

int MAX_NUMBER(int A,int B);
int MIN_NUMBER(int A,int B);

int main()
{
	int A,B;

	scanf("%d %d",&A, &B);

	if(0<=A,B&&A,B<=10000)
	{
		printf("%d\n",MAX_NUMBER(A,B));
		printf("%d",MIN_NUMBER(A,B));
	}
}

int MAX_NUMBER(int A,int B)
{
	int i;
	if(A>=B)
		i=B;
	else
		i=A;
	for(;i>=1;i--)
		if(A%i==0&&B%i==0)
			return i;

}

int MIN_NUMBER(int A,int B)
{
	return A*B/MAX_NUMBER(A,B);
}
