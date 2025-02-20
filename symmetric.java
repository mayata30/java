import java.util.*;
class symmetric
{
public static void main(String args[])
{
int i,j,r,c;
int a[][]=new int[10][10];
Scanner sc=new Scanner(System.in);
System.out .println("Enter the number of rows ");
r=sc.nextInt();
System.out.println("Enter the number of columns ");
c=sc.nextInt();
System.out.println("first matrix element...");
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
a[i][j]=sc.nextInt();
}
}
System.out.println("transpose matrix is");
for(i=0;i<r;i++)
{
for(j=0;j<c;i++)
{
System.out.println(a[j][i]+" ");
}
System.out.println(" ");
}
boolean issym=true;
{
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
if(a[i][j]!=a[j][i])
{
issym=false;
break;
}
}
if(!issym)
{
break;
}
}
if(!issym)
{
System.out.println("it is not a symmetric matrix");
}
else
{
System.out.println("it is a symmetric matrix");
}
}
}
}


