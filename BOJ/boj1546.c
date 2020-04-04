#include<stdio.h>

int main()
{
	float M=0;
	int N;
	float avg;
	float sum=0;
	float point[1001];

	scanf("%d",&N);

	if(N<=1000)
	{
		for(int i=0;i<N;i++)
		{
			scanf("%f",&point[i]);
			if(point[i]<0||point[i]>100)
				return 0;
			if(M<point[i])
				M=point[i];
		}
		for(int i=0;i<N;i++)
		{
			point[i]=point[i]/M*100;
			sum+=point[i];
		}
		avg=sum/(float)N;
		printf("%0.2f",avg);
	}
}
