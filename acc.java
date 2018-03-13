import java.util.*;
class divisable
{
public static void main(String arg[])
{
int a;
Scanner scan=new Scanner(System.in);
System.out.println("Enter the number");
a=scan.nextInt();
if(a%3==0 && a%5==0)
{
System.out.println("hi");
}
else if(a%3==0)
{
System.out.println("hellow");
}
else if(a%5==0)
{
System.out.println("hellow world");
}
else
{
System.out.println("expected");
}}}
