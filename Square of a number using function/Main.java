#include<stdio.h>
int main() {
   // Type your code here
  int calc_square(int n)
  {
    int sqr;
    sqr = n * n;
    return sqr;
  }
  
  int n, sqr;
  scanf("%d",&n);
  sqr = calc_square(n);
  printf("%d",sqr);
   return 0;
}