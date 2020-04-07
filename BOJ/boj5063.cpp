#include<stdio.h>

int main()
{
	int r,e,c;
	int n;

	scanf("%d",&n);

	for(int i=1;i<=n;i++)
	{
		scanf("%d %d %d",&r,&e,&c);
		
		if(r==(e-c))
			printf("does not matter\n");
		else if(r>(e-c))
			printf("do not advertise\n");
		else if(r<(e-c))
			printf("advertise\n");
	}


}
