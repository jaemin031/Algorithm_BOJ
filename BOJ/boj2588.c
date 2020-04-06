#include<stdio.h>

int main()
{
	int A;
	int B;
	int b[3];

	scanf("%d",&A);
	scanf("%d",&B);

	b[0]=B/100;
	b[1]=(B-(b[0]*100))/10;
	b[2]=B%10;

	for(int i=0;i<3;i++)
		b[i]=b[i]*A;

	for(int i=2;i>=0;i--)
		printf("%d\n",b[i]);
	printf("%d\n",A*B);

}
