#include<stdio.h>

int main(){
    int t=0;
    scanf("%d",&t);
    
    while(t!=0){
        int k=0;
        int dp[12]={0,};
        dp[0]=1;
        scanf("%d",&k);
        for(int i=1;i<=k;i++){
            if(i-1>=0){dp[i]+=dp[i-1];}
            if(i-2>=0){dp[i]+=dp[i-2];}
            if(i-3>=0){dp[i]+=dp[i-3];}
        }
        printf("%d\n",dp[k]);
        t--;
    }
}
