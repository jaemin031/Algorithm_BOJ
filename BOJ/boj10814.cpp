#include<stdio.h>
#include<string.h>

struct person
{
	int age;
	char name[101];
}pers[100000];


int main()
{
	int N;

	scanf("%d",&N);

	for(int i=0;i<N;i++)
		scanf("%d %s",&pers[i].age,pers[i].name);

	for(int i=1;i<=200;i++)
		for(int j=0;j<N;j++)
			if(pers[j].age==i)
				printf("%d %s\n",pers[j].age,pers[j].name);
}
