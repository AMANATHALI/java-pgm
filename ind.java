import java.util.*;
class sample
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
int a=scan.nextInt();
int[] number=new int[a];
for(int i=0;i<a;i++)
{
number[i]=scan.nextInt();
}
System.out.println("Enter the element ");
int n=scan.nextInt();
for(int j=0;j<a;j++)
{
if(n==number[j])
{
System.out.println(j);
}}}}
