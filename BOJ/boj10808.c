#include<stdio.h>

int main()
{
	int check[27];
	char check2[27]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	char S[100];
	int count=0;

	for(int i=0;i<27;i++)
		check[i]=0;

	scanf("%s",S);
	
	while(1)
	{
		if((int)S[count]>=97&&(int)S[count]<=122)
			{
			for(int i=0;i<26;i++)
			{
				if(S[count]==check2[i])
					check[i]++;
			}
		}
		count++;
		if(S[count]=='\0'||S[count]=='\n')
			break;
	}
	for(int i=0;i<26;i++)
		printf("%d ",check[i]);
}
