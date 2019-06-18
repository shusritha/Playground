#include<stdio.h>
int main()
{
  int n,first_digit,last_digit,sum;
  scanf("%d",&n);
  first_digit = n/100;
  last_digit = n%10;
  sum = first_digit + last_digit;
  printf("%d",sum);
  return 0;
}