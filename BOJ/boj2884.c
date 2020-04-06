#include<stdio.h>

int main()
{
	int H,M;

	scanf("%d %d",&H,&M);

	if(H<0||H>23||M<0||M>59)
		return 0;

	if(M>=45)
		M-=45;
	else if(M<45)
	{
		M=15+M;
		if(H==0)
		{
			H=23;
		}
		else
			H-=1;
	}
	printf("%d %d",H,M);
}
