#include <stdio.h>
int main() {
    // Type your code here
  int n;
  scanf("%d",&n);
  int val = n;
  for(int r = 1;r <= n;r ++)
  {
    for(int c = val; c >= 1;c --)
      printf("%d",c);
   
    val --;
    printf("\n");
  }
	return 0;
}