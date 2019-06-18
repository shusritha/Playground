#include <stdio.h>
int main() {
	//Type your code here
    int calc_gcd(int a, int b)
  {
    int min,gcd;
    if(a > b)
      min = b;
    else
      min = a;
    while(min >= 1)
    {
      if(((a%min)==0) && ((b%min)==0))
        gcd = min;
      break;
      min--;
    }
    return gcd;
  }
  int a, b, c,gcd_of_two= 0,gcd_of_three = 0;
  scanf("%d%d%d",&a,&b,&c);
  gcd_of_two = calc_gcd(a,b);
  gcd_of_three = calc_gcd(gcd_of_two,c);
  printf("%d",gcd_of_three);

	return 0;
}