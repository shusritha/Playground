#include <stdio.h>
int main() {
int n,ld,fd, sum=0,temp;
  scanf("%d",&n);
  temp = n;
  ld = temp%10;
  while(n >= 10){
    n=n/10;
  }
  fd = n;
  sum = fd +ld;
  printf("%d",sum);
	return 0;
}