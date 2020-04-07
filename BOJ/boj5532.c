#include<stdio.h>

int main()
{
	int L;	//방학 day
	int A;	//국어 페이지 수
	int B;	//수학 페이지 수
	int C;	//하루에 풀 수 있는 국어 페이지 수(A)
	int D;	//하루에 풀 수 있는 수학 페이지 수(B)
	int max=0;
	int A_A;
	int B_B;

	scanf("%d",&L);
	if(2>L||L>40)
		return 0;

	scanf("%d",&A);
	if(1>A||A>1000)
		return 0;

	scanf("%d",&B);
	if(1>B||B>1000)
		return 0;

	scanf("%d",&C);
	if(1>C||C>100)
		return 0;

	scanf("%d",&D);
	if(1>D||D>100)
		return 0;

	for(int i=1;;i++)
	{
		A_A=i*C;
		if(A<=A_A)
		{
			A_A=i;
			break;
		}
	}

	for(int i=1;;i++)
	{
		B_B=i*D;
		if(B<=B_B)
		{
			B_B=i;
			break;
		}
	}

	if(A_A<B_B)
		max=B_B;
	else
		max=A_A;
	printf("%d",L-max);
	int kkk;
	scanf("%d",&kkk);
}
