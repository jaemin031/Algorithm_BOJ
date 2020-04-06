#include<stdio.h>

int main()
{
	int L;
	int P;
	int paper[6];

	scanf("%d %d",&L,&P);

	for(int i=1;i<=5;i++)
		scanf("%d",&paper[i]);

	for(int i=1;i<=5;i++)
		printf("%d ",paper[i]-(L*P));

}
