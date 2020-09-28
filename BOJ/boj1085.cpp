#include<stdio.h>

int main()
{
	int x,y,w,h;
	int min=1000;

	scanf("%d %d %d %d",&x,&y,&w,&h);

	if(x<1||x>w-1||y<1||y>h-1)
		return 0;

	if(min>x)
		min=x;
	if(min>y)
		min=y;
	if(min>w-x)
		min=w-x;
	if(min>h-y)
		min=h-y;

	printf("%d",min);
}
