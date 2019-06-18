#include<stdio.h>
int main() {
    // Type your code here
  int calc_sum(int n)
  {
    int i,sum = 0;
    for(i = 1;i <= n; i++)
    {
      sum = sum + i;
    }
    return sum;
  }
  int n,sum;
  scanf("%d",&n);
  sum = calc_sum(n);
  printf("%d",sum);
  	return 0;
}