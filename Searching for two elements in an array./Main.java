#include<stdio.h>
int main()
{
  //Type your code here
  int arr_size,search_elem_1,search_elem_2,match_1 = -1, match_2 = -1;
  scanf("%d",&arr_size);
  int arr[arr_size];
  for(int i = 0; i < arr_size; i++)
  {
    scanf("%d",&arr[i]);
  }
  scanf("%d\n%d",&search_elem_1,&search_elem_2);
  for(int j = 0 ;j < arr_size ; j ++)
  {
    if(arr[j] == search_elem_1)
      match_1 = j;
    if(arr[j] == search_elem_2)
      match_2 = j;
  }
  printf("%d\n%d",match_1,match_2);
  return 0;
}