#include<stdio.h>

int main()
{
	int T,A,B;

	scanf("%d",&T);

	for(int i=1;i<=T;i++)
	{
		scanf("%d %d",&A,&B);
		
		if(0<A&&A<10&&0<B&&B<10)
			printf("Case #%d: %d\n",i,A+B);
	}
}
