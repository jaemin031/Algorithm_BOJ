#include<stdio.h>

int main()
{
	int in[8];
	int p[8]={1,2,3,4,5,6,7,8};
	int bl=0;
	int j=7;

	scanf("%d %d %d %d %d %d %d %d",&in[0],&in[1],&in[2],&in[3],&in[4],&in[5],&in[6],&in[7]);


		for(int i=0;i<8;i++)
		{
			if(in[i]!=p[i])
				break;
			if(i==7)
			{
				printf("ascending");
				bl=1;
			}
		}

		for(int i=0;i<8;i++,j--)
		{
			if(in[i]!=p[j])
				break;
			if(i==7)
			{
				printf("descending");
				bl=1;
			}
		}
		
		if(bl!=1)
			printf("mixed");

}
