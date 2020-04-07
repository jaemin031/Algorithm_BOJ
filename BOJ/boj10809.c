#include<stdio.h>

int main()
{
	char S[101];
	char check;
	int	count=-1;
	scanf("%s",S);

	for(int i=97;i<123;i++)
	{
		check=(char)i;
		count=-1;
		for(int j=0;S[j]!='\0';j++)
		{
			if(S[j]==check)
			{
				count=j;
				break;
			}
		}
		printf("%d ",count);
	}
}
