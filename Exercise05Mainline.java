package Exercise05;

import java.util.Scanner;

public class Exercise05Mainline {



  public static void main(String []args) {
	  Scanner keyboard = new Scanner(System.in); 
	  
	  System.out.println("Enter a line of text or just press return (enter) to stop the loop:");
	  
	  String input = keyboard.nextLine().trim();
  
  
  while (input.length() > 0) {
	  
  }
  Scanner value = new Scanner(input);
   
  String Is = input.trim().toLowerCase();
  
  System.out.println("The input line, trimmed and upper case converted to lower case.");
	System.out.print(Is);

	removeNonAlpha(Is);
	
	// Ask for more input
	System.out.println("***************************************");
	System.out.print("Enter a line of text or just press return (enter) to stop the loop:");
	input = keyboard.nextLine().trim();
	value.close();
}

/**********

* Given that the input String is containing no upper-case letters, this method will return a string with

* all of the non-alphabetic characters removed.

*

* @param s - the input String with no upper-case alphabet characters in it
* @return 
* @return 

* @return  - the returned String with all non-alphabetic characters removed

*/
public static void removeNonAlpha(String ls) {


String newStr="";
for (int i=0;i<ls.length();i++)
{
//Ask range for a-z A-Z
if (ls.charAt(i)>64&&ls.charAt(i)<121)
{
  newStr+=ls.charAt(i);
}
}

System.out.println("\n\nThe input line, trimmed, upper case converted to lower case, and non-alpha removed.");
System.out.println(newStr);

reverse(newStr, ls);

}

/**********

* Given a String, this method reverses the string, so that last character is the first

* character in the returned String and the first character in the input is the last

* character in the returned String.

*

* @param s - the input String

* @return  - the reverse of the input String is returned

*/
public static void reverse(String newStr, String ls) {


String reverse = "";


for(int i = newStr.length() - 1; i >= 0; i--)
{
reverse = reverse + newStr.charAt(i);
}

System.out.println("The input line, trimmed, upper case converted to lower case, non-alpha removed, and reversed.");
System.out.println(reverse);

if (reverse.equals(ls)) {

System.out.println("This is a Palindrome!");
}

else {
System.out.println("This is not a plaindrome!");
}

}
}
