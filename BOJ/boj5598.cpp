#include<stdio.h>

int main()
{
	char kai[1001];

	scanf("%s",kai);

	for(int i=0;kai[i]!=NULL;i++)
	{
		if(65<=kai[i]&&kai[i]<=67)
			printf("%c",kai[i]+23);
		else
			printf("%c",kai[i]-3);
	}
}
