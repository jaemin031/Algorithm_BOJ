#include<stdio.h>

int main()
{
	int N;
	int M;
	int i,j;
	int sum=0;
	int number[100001];
	int s[100001]={0,};
	int temp=0;
	scanf("%d %d",&N,&M);
	if(1>N||N>100000||1>M||M>100000)
		return 0;

	for(int a=1;a<=N;a++)
	{
		scanf("%d",&number[a]);
		if(number[a]<0||number[a]>1000)
			return 0;
		temp+=number[a];
		s[a]=temp;
	}

	for(int b=1;b<=M;b++)
	{
		scanf("%d %d",&i,&j);
		
		printf("%d\n",s[j]-s[i-1]);
	}
}
