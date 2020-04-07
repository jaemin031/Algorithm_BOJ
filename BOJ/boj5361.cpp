#include<stdio.h>

int main()
{
	int tc=0;
	scanf("%d",&tc);
	while(tc!=0)
	{
		int a,b,c,d,e;
		float total=0;
		scanf("%d %d %d %d %d",&a,&b,&c,&d,&e);
		total=(a*350.34)+(b*230.90)+(c*190.55)+(d*125.30)+(e*180.90);
		printf("$%0.2f\n",total);
		tc--;
	}
}
