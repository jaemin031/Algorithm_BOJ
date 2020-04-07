#include<stdio.h>
#include<string.h>

int main()
{
	char spel[101];
	int len;
	int bol=1;
	scanf("%s",spel);

	len=strlen(spel);

	if(1<=len&&len<=100)
	{
		for(int i=0;i<len/2;i++)
		{
			if(spel[i]!=spel[len-i-1])
				bol=0;
		}	
		printf("%d",bol);
	}
	int kkk;
	scanf("%d",&kkk);

}
