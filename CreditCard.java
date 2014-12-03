//Billie Weisiger
import java.util.Scanner;
public class CreditCard
{
//type of credit card
  
  public int findType(String num)
  {
    if (num.substring(0, 1).equals ("4"))
      return 2;
    else if ((num.substring(0,2).equals ("51")) || 
             (num.substring(0,2).equals ("52")) || 
             (num.substring(0,2).equals ("53")) || 
             (num.substring(0,2).equals ("54")) || 
             (num.substring(0,2).equals ("55")))
      
      return 1;
    else if ((num.substring(0,2).equals ("34")) || 
             (num.substring(0,2).equals ("37")))
      
      return 3;
    
    else if (num.substring(0,4).equals ("6011"))
      
      return 4;
    
    else if ((num.substring(0,2).equals ("36")) || 
             (num.substring(0,2).equals ("38")) || 
             (num.substring(0,3).equals ("301")) || 
             (num.substring(0,3).equals ("302")) || 
             (num.substring(0,3).equals ("303")) ||
             (num.substring(0,3).equals ("304")) || 
             (num.substring(0,3).equals ("305")))
      
      return 5;
    
    else
      
      return 0;
    
  }
  public boolean verify(String num)
  {
    int total = 0;
    boolean doubled = false; //the first number is odd, so you don't double it
    for (int i = num.length() - 1; i >= 0; i--)
    {
      if (doubled == false)
      {
        total += Integer.valueOf(num.substring(i, i+1)); //if it's odd you just add it
        doubled = true; //the next number will be even
      }
      
      else if (doubled == true) 
      {
        int even = 2 * Integer.valueOf(num.substring(i, i + 1));
        //if doubling results in a 2-digit number, add up the two digits
        if (even >= 10)
        {
          even = 1 + (even % 10); //the first number will always be one, 
          //the second will be the remainder after dividing by 10
        }
        else
        {
          total += even;
        }
        doubled = false;
      }
      
    }
    return ((total % 10 == 0) && (num.length() >= 13) && (num.length() <= 16));
    //returns true if it's divisble by 10 and the length is within 13 & 16
  }
}
















