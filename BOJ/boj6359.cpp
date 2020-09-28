#include<stdio.h>

int main()
{
	int room[102];		// 닫 0  열 1
	int T;
	int n;
	int count=0;

	scanf("%d",&T);

	for(int i=1;i<=101;i++)
		room[i]=0;
	
	while(T!=0)
	{
		scanf("%d",&n);
		if(n<5||n>100)
			return 0;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(j%i==0)
				{
					if(room[j]==0)
					{
						room[j] = 1;
						count++;
					}
					else if(room[j]==1)
					{
						room[j] = 0;
						count--;
					}
				}
			}
		}

		printf("%d\n",count);
		count=0;
		for(int i=1;i<=101;i++)
			room[i]=0;
		T--;
	}


}
