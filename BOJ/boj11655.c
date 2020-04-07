#include<stdio.h>
#include<string.h>

int main()
{
	char S[101];

	gets(S);
	for(int i=0;i<strlen(S);i++)
	{
		if('a'<=S[i]&&S[i]<='z')
		{
			if(S[i]<=109)
				S[i]+=13;
			else
				S[i]-=13;
		}
		else if('A'<=S[i]&&S[i]<='Z')
		{
			if(S[i]<=77)
				S[i]+=13;
			else
				S[i]-=13;
		}
	}
	puts(S);
}
