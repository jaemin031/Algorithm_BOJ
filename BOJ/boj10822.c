#include<stdio.h>

int main()
{
	char S[101];
	int sum=0;
	int value=0;

	scanf("%s",S);

	for(int i=0;;i++)
	{

		if(S[i]==',')
		{
			value+=sum;
			sum=0;
		}
		
		else if(S[i]==NULL)
		{
			value+=sum;
			break;
		}
		else
		{
			sum=sum*10+S[i]-48;
		}
	}
	printf("%d",value);
}
