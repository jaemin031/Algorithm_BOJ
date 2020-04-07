#include<stdio.h>
#include<string.h>

int main()
{
	char A[8],B[8];	
	int n[9];
	int max=0;
	for(int i=0;i<=8;i++)
		n[i]=0;

	scanf("%s %s",A,B);
	max=strlen(A);
	if(max<strlen(B))
		max=strlen(B);

	for(int i=0;i<strlen(A);i++)
		n[8-strlen(A)+i]=A[i]-48;
	for(int i=0;i<strlen(B);i++)
		n[8-strlen(B)+i]+=B[i]-48;

	for(int i=8-max;i<8;i++)
		printf("%d",n[i]);

}
