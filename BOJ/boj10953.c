#include<stdio.h>

int main()
{
	int T;
	int A,B;


	scanf("%d",&T);

	for(int i=1;i<=T;i++)
	{
		scanf("%d,%d",&A,&B);
		if(A<=0||B<=0||A>=10||B>=10)
			return 0;
		printf("%d\n",A+B);
	}

}
