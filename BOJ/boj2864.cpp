#include<stdio.h>

int main()
{
	char A[8],B[8];
	int max=0;
	int min=0;
	int temp=0;
	scanf("%s %s",A,B);

	for(int i=0;A[i]!=NULL;i++)
	{
		if(A[i]=='5')
			A[i]='6';
		temp=temp*10+A[i]-48;
	}
	max+=temp;
	temp=0;
	for(int i=0;B[i]!=NULL;i++)
	{
		if(B[i]=='5')
			B[i]='6';
		temp=temp*10+B[i]-48;
	}
	max+=temp;
	temp=0;
	for(int i=0;A[i]!=NULL;i++)
	{
		if(A[i]=='6')
			A[i]='5';
		temp=temp*10+A[i]-48;
	}
	min+=temp;
	temp=0;
	for(int i=0;B[i]!=NULL;i++)
	{
		if(B[i]=='6')
			B[i]='5';
		temp=temp*10+B[i]-48;
	}
	min+=temp;

	printf("%d %d",min,max);
}
