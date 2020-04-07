#include<stdio.h>

long long koong(int n);
long long ko_fa[69]={1,1,2,4,};
int main()
{
	int tc;
	long long value[71]={0,};
	int i=0;
	int number;
	int ts;
	scanf("%d",&tc);
	ts=tc;
	for(int r=4;r<=67;r++)
		ko_fa[r]=ko_fa[r-1] + ko_fa[r-2] + ko_fa[r-3] + ko_fa[r-4];
	while(tc!=0)
	{
		scanf("%d",&number);
		value[i]=koong(number);
		i++;
		tc--;
	}
	for(int j=0;j<ts;j++)
		printf("%lld\n",value[j]);
	int kkk;
	scanf("%d",&kkk);
}
long long koong(int n)
{
		return ko_fa[n];
}
