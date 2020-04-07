#include<stdio.h>

int main()
{
	long long int num=0;
	int B;
	int abs[100]={0,};
	int i=0;

	scanf("%lld",&num);
	scanf("%d",&B);

	while(num!=0)
	{
		if(num%B==0){
			abs[i]=0;
			num/=B;
		}
		else{
			abs[i]=num%B;
			num/=B;
		}
		i++;
	}
	
	for(i=i-1;i>=0;i--){
		if(abs[i]>=10)
			printf("%c",55+abs[i]);
		else
			printf("%d",abs[i]);
	}




}
