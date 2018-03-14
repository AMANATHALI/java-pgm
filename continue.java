import java.util.*;
class sample
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int i=1;
for(i=1;i<6;i++)
{
String name=sc.next();
if(i%2!=0)
{
i++;
continue;
}
System.out.println(sc);
i++;
}}}