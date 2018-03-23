import java.util.*;
class demo

{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Name");
String name=sc.nextLine();
char[] arr = name.toCharArray();
for(int i=0;i<arr.length-1;i++)
{
System.out.print(arr[0]);
System.out.print(arr[arr.length-1]);
break;
}
System.out.println("Enter the number");
int n=sc.nextInt();
char[] ch=new char[n];
for(int j=0;j<n;j++)
{
ch[j]=sc.next().charAt(0);
}
System.out.println(ch[3]);
}

}



 




 
