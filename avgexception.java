import java.util.*;
class NegExp extends Exception
{
NegExp(String s)
{
super(s);
}
}
class avgexception
{
static void avgexp() throws NegExp
{
throw new NegExp("invalid input! enter positive number.:");
}
public static void main(String args[])
{
int num[]=new int[15];
Scanner sc=new Scanner(System.in);
System.out.println("enter the count of numbers:");
int n=sc.nextInt();
try
{
int sum=0;
System.out.println("enter the numbers:");
for(int i=0;i<n;i++)
{
num[i]=sc.nextInt();
}
for(int i=0;i<n;i++)
{
if(num[i]>0)
{
sum+=num[i];
}
else
{
avgexp();
}
}
float avg=sum/n;
System.out.println("average of given number are:"+avg);
}
catch(NegExp e)
{
System.out.println(e);
}
}
}

