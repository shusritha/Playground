#include <stdio.h>
int main() {
	int n,sum=0;
  scanf("%d",&n);
  while(n != 0){
    int r = n%10;  //get last number
    sum=sum+r;
    n=n/10;      //remove the last digit;
  }
  printf("%d",sum);
  
	return 0;
}