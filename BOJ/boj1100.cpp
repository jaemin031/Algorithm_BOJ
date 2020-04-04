#include<stdio.h>

int main()
{
	char ch[9][9];
	int count=0;

	for(int i=0;i<8;i++)
	{
		scanf("%s",ch[i]);	
	}
	for(int i=0;i<8;i++)
		for(int j=0;j<8;j++)
			if((i+j)%2==0&&ch[i][j]=='F')
				count++;
	printf("%d",count);	
}
