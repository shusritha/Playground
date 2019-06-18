#include <stdio.h>
int main(){
	// Type your code here
   int greatest_2(int a, int b)
  {
    if(a > b)
    {
      return a;
    }
    else 
      return b;
  }
  int a,b,c,g;
  scanf("%d%d%d",&a,&b,&c);
  g = greatest_2(a,b);
  if(g > c)
    printf("%d",g);
  else
    printf("%d",c);
 

  	return 0;
}