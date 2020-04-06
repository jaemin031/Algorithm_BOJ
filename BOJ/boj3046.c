#include<stdio.h>

int main()
{
	int R1,R2,S;


	scanf("%d %d",&R1,&S);

	if(-1000<=R1&&R1<=1000&&-1000<=S&&S<=1000)
	{
		R2=(2*S)-R1;
		printf("%d",R2);
	}
}
