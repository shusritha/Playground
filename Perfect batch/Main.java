/* ***Test Instructions***
* There are multiple test cases to evaluate the program.
* Some test cases are visible and others are hidden.
* Your program should be generic so that it will satisfy all the test cases.
* Scan the input from stdin and print the exact output only which is as given in the sample test cases.
*/
#include<stdio.h>
int main()
{
  //Type your code here
  void calc_batch(int arr[],int arr_size)
  {
    int sum1=0,sum2=0,j,k;
    for(j = 0; j < arr_size/2; j++)
    {
      sum1 = sum1 + arr[j];
    }
    for(k = arr_size/2 ; k < arr_size ; k++)
    {
      sum2 = sum2 + arr[k];
    }
   if(sum1 == sum2)
   {
     printf("Perfect Batch");
   }
    else
      printf("Not a Perfect Batch");
  }
  int arr_size,i,arr[arr_size];
  scanf("%d",&arr_size);
  
  for(i = 0; i < arr_size; i++)
  {
    scanf("%d",&arr[i]);
  }
  
  calc_batch(arr,arr_size); 
  return 0;
}

