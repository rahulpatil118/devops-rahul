import java.util.Scanner;
public class PalindromeExample{  
 public static void main(String args[]){  
  int r,sum=0,temp;
  int n=15951;
  
  temp=n;
  while(n>0){
	  r=n%10;
	  sum=(sum*10)+r;
	  n=n/10;
  }
  if(temp==sum)
	  System.out.println("its palindrome number");
  else
	  System.out.println("not palindrome");
		
 }
  
}  