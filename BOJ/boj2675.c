#include<stdio.h>

int main()
{

	int T;
	int R=0;
	int o=0;
	char S[21];
	char G[161];

	scanf("%d",&T);
	if(1<=T&&T<=1000)
	{
		for(int a=0;a<T;a++)
		{
			scanf("%d %s",&R,&S);
			for(int b=0;b<160;b++)
				G[b]='\0';
			o=0;
			if(1>R||R>8)
				return 0;
			for(int c=0;c<160;c++)
			{
				for(int d=0;d<R;d++,c++)
					G[c]=S[o];
				c--;
				o++;
			}
			printf("%s\n",G);
		}
	}
}
