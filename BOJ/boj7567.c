#include<stdio.h>
#include<string.h>

int main()
{
	int sum=10;
	char gu[51];

	gets(gu);
	
	for(int i=0;i<strlen(gu)-1;i++)
	{
		if(gu[i]!=gu[i+1])
			sum+=10;
		else
			sum+=5;
	}
	printf("%d",sum);
}
