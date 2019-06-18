#include <stdio.h>
int main() {
	//Type your code
  int i,n,counter=0;
  scanf("%d",&n);
  for(i=0;i<=n;i++){
    counter = counter+i;
  }
  printf("%d",counter);
	return 0;
}