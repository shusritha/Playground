#include<stdio.h>

int main(){
    // Type your code here
  int calc_power(int b,int e)
  {
    int power = 1, count;
   for(count = 1;count <= e; count ++)
   {
     power = power * b;
     
   }
    return power;
  }
  int base, exponent, power;
  scanf("%d\n%d",&base,&exponent);
  power = calc_power(base, exponent);
  printf("%d",power);
  	return 0;
}

  