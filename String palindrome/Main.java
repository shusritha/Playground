#include<stdio.h>
#include<strings.h>
int main()
{
  //Type your code here
  char str[100],strrev[100],end;
  int i,len;
  gets(str);
  len = strlen(str);
  end = len-1; 
  for(i = 0;i < len;i++)
  {
    
    strrev[i] = str[end];
    end--;
  }
  strrev[i] = '\0';
  
  if(strcmp(str,strrev) == 0)
  {
    printf("%s is a palindrome\n",str);
  }
  else
  {
    printf("%s is not a palindrome",str);
  }
  
  

  return 0;
}

