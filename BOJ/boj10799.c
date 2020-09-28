#include<stdio.h>
#include<string.h>

int main()
{
	char S[100001];
	int n;
	int p=0;
	int count=0;
	
	gets(S);
	n=strlen(S);

	for(int i=0;i<n;i++){
		if(S[i]=='('&&S[i+1]!=')'){
			p++;
			count+=1;
		}
		else if(S[i]!='('&&S[i+1]==')')
			p--;
		else if(S[i]=='('&&S[i+1]==')')
			count+=p;
	}
	printf("%d",count);
}
