#include<stdio.h>

int main()
{
	char X[8];
	int vl=0;

	scanf("%s",X);

	if(X[0]=='0'&&X[1]=='x')		//16진수
	{
		if(X[2]>='0'&&X[2]<='9')
			vl=X[2]-'0';
		else if(X[2]>='a'&&X[2]<='f')
			vl=X[2]-87;
		for(int i=3;X[i]!=NULL;i++)
		{
			vl*=16;
			if(X[i]>='0'&&X[i]<='9')
				vl+=X[i]-'0';
			else if(X[i]>='a'&&X[i]<='f')
				vl+=X[i]-87;
		}
		printf("%d",vl);
	}
	else if(X[0]=='0'&&X[1]!='x')	//8진수
	{
		vl=X[1]-'0';
		for(int i=2;X[i]!=NULL;i++)
		{
			vl*=8;
			vl+=X[i]-'0';
		}
		printf("%d",vl);
	}
	else
		printf("%s",X);
}
