#include <stdio.h>
int main(){
	// Type your code here
  int cur_row,cur_col,n;
  int turn = 0;
  scanf("%d",&n);
  for(cur_row = 1;cur_row<= n;cur_row++){
    for(cur_col = 1;cur_col <= cur_row;cur_col++){
      if(turn == 0){
        printf("*");
        turn = 1;
      }
      else{
        printf("#");
        turn = 0;
      } 
    }
    printf("\n");
  }
  	return 0;
}