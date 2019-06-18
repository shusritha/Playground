#include <stdio.h>
int main() {
	// Type your code here
  int n,val = 1;
  scanf("%d",&n);
  for(int r = 1;r <= n;r++)
  { 
    for(int s = 1; s <= n-r;s ++)
      printf(" ");
    for(int c = 1; c <= r; c++)
    {
      printf("%d ",val);
      val ++;
    }
    printf("\n");
  }
	return 0;
}