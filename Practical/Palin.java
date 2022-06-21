import java.util.*;
class Palin {
  public static void main(String[] args) {
    int num= 343;
  
    int reverse=0, element, remainder; 
    element = num;
  
    while(num!=0){
      remainder= num % 10;
      reverse = (reverse * 10) + remainder;
      num = num / 10;
    }
  
    if (element == reverse){
      System.out.println("Yes, it is palindrome");
    }
    else{
      System.out.println("No, it is not palindrome");
    }
  }
}