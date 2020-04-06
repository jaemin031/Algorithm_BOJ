#include<stdio.h>

int main()
{
	char spel[101];

	scanf("%s",spel);

	for(int i=0;spel[i]!=NULL;i++)
	{
		if(spel[i]>='a'&&spel[i]<='z')
			printf("%c",spel[i]-32);
		else if(spel[i]>='A'&&spel[i]<='Z')
			printf("%c",spel[i]+32);
	}
}
