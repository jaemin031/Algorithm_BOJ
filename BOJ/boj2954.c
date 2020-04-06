#include<stdio.h>
#include<string.h>

int main()
{
	char spel[101];
	int i=0;
	gets(spel);

	
	while(spel[i]!='\0')
	{
		if(spel[i]=='a'||spel[i]=='e'||spel[i]=='o'||spel[i]=='u'||spel[i]=='i')
		{
			i++;
			if(spel[i]=='p')
				i++;
		}
		printf("%c",spel[i]);
		i++;
	}
}
