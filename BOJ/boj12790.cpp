#include<stdio.h>

struct ch{
	int hp;
	int mp;
	int at;
	int dp;
	int tp;
}ch[1001];


int main()
{
	int n;
	int a=0;
	int b=0;
	int c=0;
	int d=0;

	scanf("%d",&n);

	for(int i=0;i<n;i++){
		scanf("%d %d %d %d %d %d %d %d",&ch[i].hp,&ch[i].mp,&ch[i].at,&ch[i].dp,&a,&b,&c,&d);
		if((ch[i].hp+a)<1)
			ch[i].hp=1;
		else
			ch[i].hp+=a;
		if((ch[i].mp+b)<1)
			ch[i].mp=1;
		else
			ch[i].mp+=b;
		if((ch[i].at+c)<0)
			ch[i].at=0;
		else
			ch[i].at+=c;
		ch[i].dp+=d;

		ch[i].tp=1*ch[i].hp+5*ch[i].mp+2*ch[i].at+2*ch[i].dp;
	}

	for(int i=0;i<n;i++)
		printf("%d\n",ch[i].tp);


}
