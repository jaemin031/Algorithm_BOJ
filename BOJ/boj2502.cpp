#include<stdio.h>

int main()
{
	int A;	//첫날
	int B;	//둘째날
	int D;	//넘어온 날
	int K;	//그 날의 떡
	int day[32];
	int check=0;

	scanf("%d %d",&D,&K);
	if(D<3||D>30||K<10||K>100000)
		return 0;
	for(int a=0;a<=31;a++)
		day[a]=0;
	for(day[0]=1;day[0]<=K&&check!=1;day[0]++)
	{
		for(day[1]=1;day[0]+day[1]<=K&&check!=1;day[1]++)
		{
			for(int i=2;i<=31;i++)
				day[i]=day[i-1]+day[i-2];
			if(day[D-1]==K)
			{
				check=1;
				printf("%d\n%d",day[0],day[1]);
			}
		}

	}
}
