#include<stdio.h>

int swap(int n);
int max(int a,int b);

int main()
{
	int A;
	int B;

	scanf("%d %d",&A,&B);

	if(A!=B)
	{
		printf("%d",max(swap(A),swap(B)));
	}
}

int swap(int n)
{
	int n1,n2,n3,temp;

	n1=n/100;
	n2=(n%100)/10;
	n3=n%10;

	if(n1!=0&&n2!=0&&n3!=0)
	{
		temp=n1;
		n1=n3;
		n3=temp;
	}

	return (n1*100)+(n2*10)+n3;
}

int max(int a,int b)
{
	if(a>b)
		return a;
	else if(b>a)
		return b;
}
