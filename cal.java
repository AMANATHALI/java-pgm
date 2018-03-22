import java.util.*;
class call
{
public static void main(String arg[])
{
Scanner scan=new Scanner(System.in);
float a,b;
char operator;
do
{
System.out.print("1. Addition");
System.out.print("2. Subtraction");
System.out.print("3. Multiplication");
System.out.print("4. Division");
System.out.println("5. Exit");
System.out.println("Enter Your Choice : ");
operator=scan.next().charAt(0);
switch(operator)
{
case '1' : System.out.println("Enter Two Number : ");
a = scan.nextFloat();
b = scan.nextFloat();
System.out.print( a + b);
 break;
case '2' : System.out.println("Enter Two Number : ");
 a = scan.nextFloat();
 b = scan.nextFloat();
 System.out.print( a - b);
 break;
case '3' : System.out.println("Enter Two Number : ");
a = scan.nextFloat();
b = scan.nextFloat();
System.out.print( a * b);
break;
case '4' : System.out.println("Enter Two Number : ");
a = scan.nextFloat();
b = scan.nextFloat();
System.out.print( a / b);
break;
case '5' : System.exit(0);
break;
default :
System.out.print("not a operator");
break;
}
}while(operator != 5);       
}
}
 