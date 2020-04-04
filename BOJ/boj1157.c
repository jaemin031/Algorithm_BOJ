#include<stdio.h>
#include<string.h>

int main()
{
	char spel[1000001];
	char alpha[27]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	char beta[27]={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
	int count[27];
	int point=0;
	int max=0;
	for(int i=0;i<27;i++)
		count[i]=0;

	int n;
	scanf("%s",spel);
	
	n=strlen(spel);

	for(int i=0;i<n;i++)
	{
		for(int j=0;j<27;j++)
		{
			if(spel[i]==alpha[j]||spel[i]==beta[j])
			{
				count[j]++;
				break;
			}
		}
	}

	for(int i=0;i<27;i++)
	{
		if(max<count[i])
		{
			max=count[i];
			point=i;
		}
	}
	for(int i=0;i<27;i++)
	{
		if(i!=point&&count[i]==count[point])
		{
			printf("?");
			return 0;
		}
	}
	printf("%c",beta[point]);

}
