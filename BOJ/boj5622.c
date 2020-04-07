#include<stdio.h>


int main()
{

	int time=0;
	int count=0;
	char S[16];

	scanf("%s",S);

	while(1)
	{
		if(S[count]=='\n'||S[count]=='\0')
			break;
		if((int)S[count]<65||(int)S[count]>90)
			return 0;

		if(65<=(int)S[count]&&(int)S[count]<=67)
			time+=3;
		else if(68<=(int)S[count]&&(int)S[count]<=70)
			time+=4;
		else if(71<=(int)S[count]&&(int)S[count]<=73)
			time+=5;
		else if(74<=(int)S[count]&&(int)S[count]<=76)
			time+=6;
		else if(77<=(int)S[count]&&(int)S[count]<=79)
			time+=7;
		else if(80<=(int)S[count]&&(int)S[count]<=83)
			time+=8;
		else if(84<=(int)S[count]&&(int)S[count]<=86)
			time+=9;
		else if(87<=(int)S[count]&&(int)S[count]<=90)
			time+=10;
		count++;
	}
	printf("%d",time);

}
