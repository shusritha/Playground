#include<stdio.h>
int main()
{
  int n,res;
  scanf("%d",&n);
  res = ((n/10)%10);
  printf("%d",res);
  return 0;
}