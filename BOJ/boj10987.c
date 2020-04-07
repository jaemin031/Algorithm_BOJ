#include<stdio.h>

int main()
{
	char spel[101];
	int count=0;

	scanf("%s",spel);

	for(int i=0;spel[i]!='\0';i++)
	{
		if(spel[i]=='a'||spel[i]=='e'||spel[i]=='i'||spel[i]=='o'||spel[i]=='u')
			count++;
	}
	printf("%d",count);

}
