#include<stdio.h>
int main()
{
    int sum=0,n,l,f;
    scanf("%d",&n);
    l=n%10;
    f=n;
while(n>=10)
{
n=n/10;
}
f=n;
sum=l+n;
printf("%d",sum);
}