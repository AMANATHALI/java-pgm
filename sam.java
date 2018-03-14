class sample
{
 int add(int a,int b)
{
return a+b;
}
int add(int a,int b,int c)
{
return a+b+c;
}}
 class demo
{
public static void main (String args[])
{
sample s=new sample();
System.out.println(s.add(4,5));
System.out.println(s.add(4,5,6));
}}