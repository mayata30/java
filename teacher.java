import java.util.*;
class person
{
	String name,gender,address;
	int age;
	person(String name, String gender, String address,int age)
	{
		this.name=name;
		this.gender=gender;
		this.address=address;
		this.age=age;
	}
}
class employee extends person
{
	int empid,salary;
	String comp_name,qualify;
	employee(String name, String gender, String address,int age,int empid,int salary,String comp_name,String qualify)
	{
		super(name,gender,address,age);
		this.empid=empid;
		this.salary=salary;
		this.comp_name=comp_name;
		this.qualify=qualify;
	}
}
class teacher extends employee
{
		int teachid;
		String sub,dept;
		teacher(String name, String gender, String address,int age,int empid,int salary,String comp_name,String qualify,int teachid,String sub,String dept)
		{
			super(name,gender,address,age,empid,salary,comp_name,qualify);
			this.teachid=teachid;
			this.sub=sub;
			this.dept=dept;
		}
		void display()
		{
			System.out.println("Name is "+name);
			System.out.println("gender is "+gender);
			System.out.println("address is "+address);
			System.out.println("age is "+age);
			System.out.println("employee id is "+empid);
			System.out.println("salary is "+salary);
			System.out.println("company name is "+comp_name);
			System.out.println("qualification is "+qualify);
			System.out.println("teacher id is "+teachid);
			System.out.println("subject is "+sub);
			System.out.println("department is "+dept);
		}
		public static void main(String args[])
		{
			int n,i;
			Scanner op=new Scanner(System.in);
			Scanner op1=new Scanner(System.in);
			System.out.println("Enter the number of teachers :");
			n=op.nextInt();
			teacher arr[]=new teacher[n];
			for(i=0;i<n;i++)
			{
			
				System.out.println("Enter "+(i+1)+"th teacher details :");
				System.out.println(" Enter teacher name :");
				String name=op1.nextLine();
				System.out.println(" Enter teacher gender :");
				String gender=op1.nextLine();
				System.out.println(" Enter teacher address :");
				String address=op.nextLine();
				System.out.println(" Enter teacher age :");
				int age=op.nextInt();
				System.out.println(" Enter teacher employee id :");
				int empid=op.nextInt();
				System.out.println(" Enter teacher salary :");
				int salary=op.nextInt();
				System.out.println(" Enter teacher company name :");
				String comp_name=op1.nextLine();
				System.out.println(" Enter teacher qualification :");
				String qualify=op1.nextLine();
				System.out.println(" Enter teacher id :");
				int teachid=op.nextInt();
				System.out.println(" Enter teacher subject :");
				String sub=op1.nextLine();
				System.out.println(" Enter teacher department :");
				String dept=op1.nextLine();
				arr[i]=new teacher(name,gender,address,age,empid,salary,comp_name,qualify,teachid,sub,dept);
			}
			System.out.println("Details of the teachers are :");
			for(i=0;i<n;i++)
			{
				arr[i].display();
				System.out.println("\n");
			}
		}
	}

			
			
			
