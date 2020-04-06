#include<stdio.h>

int main()
{
	int N;
	int max=0;
	

	scanf("%d",&N);

	for(int i=1;i<=N;i++)
	{
		int a,b,c;
		int max_n=0;
		scanf("%d %d %d",&a,&b,&c);
		if(a==b&&b==c){
			if(max<10000+a*1000){
				max=10000+a*1000;}}
		else if(a!=b&&b!=c&&c!=a){
			max_n=a;
			if(max_n<b)
				max_n=b;
			if(max_n<c)
				max_n=c;
			if(max<max_n*100)
				max=max_n*100;
		}
		else{
			if(a==b)
				max_n=a;
			else if(b==c)
				max_n=b;
			else if(a==c)
				max_n=c;
			if(max<1000+max_n*100)
				max=1000+max_n*100;
		}
	}
	printf("%d",max);
}
