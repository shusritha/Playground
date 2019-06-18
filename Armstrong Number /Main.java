#include <stdio.h>
int main() {
	int n,sum = 0,rem,digits = 0;
  scanf("%d",&n);
  int temp = n;
  while(temp != 0){
    digits++;
    temp = temp / 10;
  }
  temp = n;
  
  while(temp != 0){
  rem = temp % 10;
  sum = sum + pow(rem,digits);
  temp = temp/10;
 }
  if(n == sum){
  printf("Armstrong Number\n");
  }
  else
    printf("Not an Armstrong Number");
  
  
	return 0;
}