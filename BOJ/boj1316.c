#include<stdio.h>
#include<string.h>

int count=0;
int cu(char name[101]);

int main()
{
	int N;
	scanf("%d",&N);
	while(N!=0)
	{
		char ab[101];
		scanf("%s",ab);

		cu(ab);
		N--;
	}
	printf("%d",count);
}

int cu(char name[101])
{
	int pt=0;
	char n[101];
	
	for(int i=0;i<strlen(name);i++)
	{
		if(i==0)
			n[0]=name[0];
		else
		{
			if(name[i]==n[pt])
				continue;
			else if(name[i]!=n[pt])
			{
				for(int j=0;j<=pt;j++)
					if(name[i]==n[j])
						return 0;
				pt++;
				n[pt]=name[i];
			}
		}
	}

	return count++;
}
