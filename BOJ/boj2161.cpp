#include<stdio.h>

int main()
{
	int N;		// 입력 값 ( 1 ~ N 번까지의 카드 생성)
	int number[1001];	// 카드 리스트 배열
	int dec=0;		// 버리고 출력할 변수

	scanf("%d",&N);

	if(1<=N&&N<=1000)
	{
		for(int i=0;i<1001;i++)	// 초 기 화
			number[i]=0;

		for(int i=1;i<=N;i++)	// 카드 배열 생성
		{
			number[i]=i;
		}

		for(int i=1;i<=N;i++)
		{
			
			dec=number[1];
			for(int j=1;j<=N-i;j++)
			{
				number[j]=number[j+1];
			}
			
			number[N-i+1]=number[1];
			
			for(int j=1;j<=N-i;j++)
			{
				number[j]=number[j+1];
			}

			printf("%d ",dec);	// dec 출력
		}
	}
}
