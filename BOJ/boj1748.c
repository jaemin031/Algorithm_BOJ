#include<stdio.h>

int main()
{
	int N;
	int count=0;

	scanf("%d",&N);
	if(N<1||N>100000000)
		return 0;
	
	for(N;N>0;N--)
	{
		if(N==100000000)
			count+=9;
		else if(N<100000000&&N>=10000000)
			count+=8;
		else if(N<10000000&&N>=1000000)
			count+=7;
		else if(N<1000000&&N>=100000)
			count+=6;
		else if(N<100000&&N>=10000)
			count+=5;
		else if(N<10000&&N>=1000)
			count+=4;
		else if(N<1000&&N>=100)
			count+=3;
		else if(N<100&&N>=10)
			count+=2;
		else if(N<10&&N>=1)
			count+=1;
	}
	printf("%d",count);
	
}
