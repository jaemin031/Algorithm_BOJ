#include<stdio.h>

int main()
{
	int x,y;
	char day[7][4] = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
	int dayn[12] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	int total=0;

	scanf("%d %d",&x,&y);
	for(int i=0;i<x-1;i++)
	{
		total+=dayn[i];
	}
	total+=y;
	printf("%s",day[total%7]);
}
