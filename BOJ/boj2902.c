#include<stdio.h>


int main()
{
	char spel[101];

	scanf("%s",spel);

	for(int i=0;spel[i]!='\0';i++)
	{
		if((int)spel[i]==45||(65<=(int)spel[i]&&(int)spel[i]<=90)||(97<=(int)spel[i]&&(int)spel[i]<=122))
		{
			if(i==0&&(65<=(int)spel[i]&&(int)spel[i]<=90))
				printf("%c",spel[i]);
			if((int)spel[i]==45&&(65<=(int)spel[i+1]&&(int)spel[i+1]<=90))
				printf("%c",spel[i+1]);
		}
	}
}
