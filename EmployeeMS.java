import java.util.Scanner;
class EmployeeMS
{	
	static String eName;
	static int eid;
	static String eRole;
	static double sal;
	public static void main(String[] args) 
	{	
		Scanner sc=new Scanner(System.in);
		System.out.println("*** WELCOME ***");
		System.out.println("\n");
		features:
		for (; ; ) {
			System.out.println("***features***");
			System.out.println();
			System.out.println("1.Enter the Employee data : \n2.view data : \n3.edit data : \n4.exit");
			System.out.println();
			System.out.print("Enter the options : ");
			int opn=sc.nextInt();
			System.out.println();
		switch(opn){
		case 1 :{
				employName();
		        break;
		        }
		case 2 :{
				 viewData();		
		 		  break;
				}
		case 3 :{
				   for (; ; ) {

				   	System.out.print("Edit Employ data");
				   System.out.println();
				   System.out.println("1.Edit name/data: \n2.edit Eid \n3.Edit Employee Role \n4.Edit Employee Salary \n5.view Data \n6.exit");
				  	System.out.println();
				  	System.out.print("enter the option : ");
				  	int op1=sc.nextInt();
				  	switch(op1)
				  	{
				  	case 1:{
				  				 editData();
				  				 break; 
				  		   }
				  	case 2:{
				  				empId() ;
				  				break;
				  	       }
				  	case 3:{
				  				empRole() ;
				  				break;
				  	       }
				  	case 4:{
				  				eSalary();
				  				break; 
				  	       }
				  	case 5:{
				  			viewData() ;
				  			break;
				  	       }
				  	case 6:{
				  			System.exit(0);
				  			break;
				  			}
				  	case 7:{
				  			editData();
				  			break;
				  			}
				   }
				  }	
				}
		case 4 :{
			System.exit(0);
				}
		  default:System.out.println("Invalid Input");
		}	
		}
		
	}
	public static void employName()
	{
		Scanner s=new Scanner(System.in);
		System.out.print("1.Enter your name : ");
		    eName=s.nextLine();

		System.out.print("2.Enter your EId : ");
		 	 eid=s.nextInt();
		 	 Scanner p=new Scanner(System.in);
		System.out.print("3.Enter your ERole : ");
		 	 eRole=p.nextLine();

		System.out.print("4. Enter your sal : ");
		 	 sal=s.nextDouble();
		 	 System.out.println("employee data created");
	}
	public static void viewData() 
	{	
		Scanner l=new Scanner(System.in);
		System.out.print("enter the employ ID : ");
		int eid1=l.nextInt();
		if (eid==eid1)
		{
		System.out.println("Name : "+eName);
		System.out.println("Employee ID : "+eid);
		System.out.println("Employee Role : "+eRole);
		System.out.println("Employee sal : "+sal);	
		}else
		{
			System.out.println("Envalid Input!!!");
		}
	}
	public static void editname() 
	{	
		Scanner pt=new Scanner(System.in);
		System.out.print("enter the name : ");
		String ename1=pt.nextLine();
		eName=ename1;
		System.out.print("name edited");
	}
	public static void empId() 
	{	
		Scanner pt=new Scanner(System.in);
		System.out.print("enter the ne ID : ");
		int empId=pt.nextInt();
		eid=empId;
	}
	public static void empRole() 
	{	
		Scanner pt=new Scanner(System.in);
		System.out.print("enter the employee role : ");
		String erole1=pt.nextLine();
		eRole=erole1;
	}
	public static void eSalary() 
	{	
		Scanner pt=new Scanner(System.in);
		System.out.print("enter the new salary : ");
		int esal=pt.nextInt();
		sal=esal;
	}

	public static void editData()
	{	
		editEmp:
		for (; ; ) 
		{
			Scanner sc=new Scanner(System.in);
		System.out.print("Edit Employ data");
				   System.out.println();
				   System.out.println("1.Edit name: \n2.edit Eid \n3.Edit Employee Role \n4.Edit Employee Salary \n5.view Data \n6.exit");
				  	System.out.println();
				  	System.out.print("enter the option : ");
				  	int op1=sc.nextInt();
				  	switch(op1)
				  	{
				  	 case 1:
				  	 { Scanner pt=new Scanner(Sys)
						System.out.print("enter the name : ");
						String ename1=sc.nextLine();
						eName=ename1;
						System.out.print("name edited");
						break;
				  	 }
				  	case 2:
				  		{

						System.out.print("enter the ne ID : ");
						int empId=sc.nextInt();
						eid=empId;
						System.out.println("EID updated ");
						break;
				  		}
				  	case 3:
				  		{
						System.out.print("enter the employee role : ");
						String erole1=sc.nextLine();
						eRole=erole1;
						System.out.println("eRole edited");
						break;
				  		}
				  	case 4:
				  		{
						
						System.out.print("enter the new salary : ");
						int esal=sc.nextInt();
						sal=esal;
						System.out.print("Esal edited");
						break;
				  		}
				  	case 5:
				  		{
				  			System.exit(0);	
				  		}

				  	}
		}
	}
}
