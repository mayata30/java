import java.util.*;
public class Symmetric
{
	public static void main(String args[])
	{			
		int i,j,r,c;
		int a[][]=new int[10][10];	
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the no. of rows in the matrix:");
		r=sc.nextInt();
		System.out.println("Enter the no. of columns in the matrix:");
		c=sc.nextInt();
		System.out.println("Enter the elements of the matrix:");
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Transpose of the matrix:");		
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{			
				System.out.print(a[j][i]+"  ");
			}
			System.out.println("  ");
		}
		boolean isSym = true;
		
			for(i=0;i<r;i++)
			{			
				for(j=0;j<c;j++)
				{	
					if(a[i][j] != a[j][i])
					{
						isSym = false;
						break;	
					}
				}
				/*if(!isSym)
				{				
					break;
				}*/
			}	
			if(!isSym)
			{
				System.out.println("It is not a symmetric matrix");
			}
			else
			{
				System.out.println("It is a symmetric matrix");
			}
		
	}
}
								
										
								
			
		
