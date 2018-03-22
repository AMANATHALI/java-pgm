import java.util.*;
class prime
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
int a;
int b=1;
System.out.println("Enter the number");
a=sc.nextInt(); 
for(int i=2;i<a/i;i++)
{
if(a%i==0)
{
b=0;
break;
}
}
if(b==1)
{
System.out.println("the given number is prime");
}
else
{
System.out.println("the given number is not prime");
}}}
