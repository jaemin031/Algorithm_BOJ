#include<stdio.h>

int main()
{
	int N;	// 참가자의 수	(2<=N<=200)
	int point[201][6];	// 점수표
	int bl=0;		//1(참=동일한점수 없음)

	scanf("%d",&N);

	if(2<=N&&N<=200)
	{
		for(int i=0;i<N;i++)
		{
			scanf("%d %d %d",&point[i][0],&point[i][1],&point[i][2]);
			if(point[i][0]<1||point[i][0]>100||point[i][1]<1||point[i][1]>100||point[i][2]<1||point[i][2]>100)
				return 0;
		}
		for(int i=0;i<200;i++)
			point[i][4]=0;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<N;j++)
			{
				bl=0;
				for(int k=0;k<N;k++)
				{
					if(point[j][i]==point[k][i])
						bl++;
				}
				if(bl==1)
					point[j][4]+=point[j][i];
			}
		}

		for(int i=0;i<N;i++)
			printf("%d\n",point[i][4]);


	}
}
