import java.util.*;
class vowel
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
String name=scan.nextLine();
System.out.println("Enter the character");
switch(name)
{
case "a":
         System.out.println(" a is a vowel");
break;
case "e":
          System.out.println(" e is a vowel");
break;
case "i":
           System.out.println(" i is a vowel");
break;
case "o":
           System.out.println(" o is a vowel");
break;
case "u":
           System.out.println(" u is a vowel");
break;
default:
          System.out.println(" not a vowel");
}}}