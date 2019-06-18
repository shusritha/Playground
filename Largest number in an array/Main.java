#include<stdio.h>
int main()
{
  //fill the code
  int arr_size,max_number;
  scanf("%d",&arr_size);
  int arr[arr_size];
  for(int i = 0; i < arr_size; i++)
  {
    scanf("%d",&arr[i]);
  }
  if(arr[0]>arr[1])
  {
    max_number = arr[0];
  }
  else
    max_number = arr[1];
  for(int j = 2;j < arr_size; j++)
  {
    if(max_number < arr[j])
      max_number = arr[j];
  }
  printf("%d",max_number);
    
    
    
    
    
    
    
    
    
    
    
    
    
  return 0;
}