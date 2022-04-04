import java.util.*;
class Nested
{
public static void main(String args[])
{
Scanner obj=new Scanner(System.in);
System.out.println("enter the num1");
int num1=obj.nextInt();
System.out.println("enter the num2");
int num2=obj.nextInt();
System.out.println("enter the num3");
int num3=obj.nextInt();
if(num1>num2)
{
if(num2>num3)
{
System.out.println("num2 is greater than num3 but less than num1");
}
else
{
System.out.println("num2 is less than num3 and less than num1");
}
}
elseif(num1<num3)
{
if(num3>num2)
{
System.out.println("num3 is greater than num1 and  num2");
}
else
{
System.out.println("num3 is greater than num1 but less than  num2");
}
}
else
{
System.out.println("not no");
}
}
}