#include<stdio.h>
int main()
{
    int n;
    scanf("%d",&n);
    if(n%2==1){
        printf("weird");
    }
    else{
        if(2<=n && n<=5) printf("not weird");
        else if(6<=n && n<=20) printf("weird");
        else printf("not weird");
    }
}