
import java.util.Scanner;
class SwitchBank
{
	
	private String name;
	private String address;
	private long addhar;
	private String panNumber;
	private int upiPin;
	private double balance;
	private long phoneNumber;

	SwitchBank(String name,String address,long addhar,String panNumber,int upiPin,double balance,long phoneNumber)
	{
		this.name=name;
		this.address=address;
		this.addhar=addhar;
		this.panNumber=panNumber;
		this.upiPin=upiPin;
		this.balance=balance;
		this.phoneNumber=phoneNumber;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String updateName)
	{
	  	this.name=updateName;
    }
    public String getAddress()
    {
    	return address;
    }
    public void setAddress(String updateAddress)
    {
    	this.address=updateAddress;
    }
    public long getaddhar()
    {
    	return addhar;
    }
    public void setAddhar(long updateAddhar)
    {
    	this.addhar=updateAddhar;
    }
    public String getPanNumber()
    {
    	return panNumber;
    }
    public void setPanNumber(String updatePanNumber)
    {
    	this.panNumber=updatePanNumber;
    }
    public int getUpiPin()
    {
    	return upiPin;
    }    
    public void setUpiPin(int updateUpiPin)
    {
    	this.upiPin=updateUpiPin;
    }
    public double getBalance()
    {
    	return balance;
    }
    public void setBalance(double updateBalance)
    {
    	this.balance=updateBalance;
    }
    public long getPhoneNumber()
    {
    	return phoneNumber;
    }
    public void setPhoneNumber(long updatePhoneNumber)
    {	 
    	this.phoneNumber=updatePhoneNumber;
    }

	
}


class BankDriver
{

	static String name;
	static String add;
	static long addhar;
	static String pan;
	static int pin;
	static double amount;
	static long contact;

	static{
		System.out.println("*********WELCOME TO SWITCH BANK*******");
	}
	public static void main(String[] args) 
	{	
		myBank:	
		for (; ; ) 
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Create Acount \n2.Existing account \n3.Exit");
		System.out.print("Enter the Number : ");
		int num=sc.nextInt();
		System.out.println("\\*****\\");
		switch(num)
		{
		case 1:
			{
				createAccount();
				break;
			}
		case 2:
			{
				existingAccount();
				break;
			}
		case 3:
			{
				System.exit(0);
				break;
			}
		default:{System.out.println("Invalid Input");}
		}
		System.out.println("//***************//");

		}

	}

	public static void createAccount() 
	{
	  System.out.println("***CREATE ACCOUNT***");
	  Scanner sc1=new Scanner(System.in);
		System.out.print("1.Enter the name : ");
			name=sc1.nextLine();

		System.out.print("2.Enter the Address : ");
			add=sc1.nextLine();

		System.out.print("3.Enter the ADDHAR card Details : ");
			addhar=sc1.nextLong();

		Scanner sc2=new Scanner(System.in);

		System.out.print("4.Enter the PANCARD Details : ");
			pan=sc2.nextLine();

		System.out.print("5.Enter the UPIPIN : ");
			pin=sc1.nextInt();

		System.out.print("6.Enter the Amount : ");
			amount=sc1.nextDouble();

		System.out.print("7.Enter the CONTACT NUMBER : ");
			contact=sc1.nextLong();


		SwitchBank obj=new SwitchBank(name,add,addhar,pan,pin,amount,contact);
		System.out.println("*** Account created Sucsessfully ***");

		System.out.println("1.Check Account Details \n2.Exit");
		System.out.print("Enter the Option : ");
		int option=sc1.nextInt();
		switch(option)
			{
				case 1: {
					System.out.print("Enter pin :");
				int pincode=sc1.nextInt();
				if (pin==pincode) {
				System.out.println(obj.getName());
				System.out.println(obj.getAddress());
				System.out.println(obj.getaddhar());
				System.out.println(obj.getPanNumber());
				System.out.println(obj.getUpiPin());
				System.out.println(obj.getBalance());
				System.out.println(obj.getPhoneNumber());
				}else
				System.out.println("Try again");
				break;
				}
			case 2:
				{
					System.exit(0);
					break;
				}
			default:{
				System.out.println("Invalid Input");
				}
		}
	}

	public static void existingAccount() 
	{	
		loop:
		for (; ; ) {
			SwitchBank obj=new SwitchBank(name,add,addhar,pan,pin,amount,contact);
		System.out.println("**Account Detels**");	
		System.out.println("1.Check Balence \n2.Deposite Amount \n3.Widrow Amount \n4.Update Account \n5.Existing Account\n6.logout");
		Scanner cs=new Scanner(System.in);
		System.out.println("Enter the option");
		int option=cs.nextInt();
		switch(option)
		{
			case 1:
			{

				System.out.print("Enter pin :");
				int pincode=cs.nextInt();
				if (pin==pincode) 
				{
					System.out.println(obj.getBalance());	
				}
				break;
			}
			case 2:
				{

					System.out.println("Deposite amount :");
					int money=cs.nextInt();
					amount=amount+money;
					break;
				}
			case 3:
				{
					System.out.println("Widrow Amount :");
					int money1=cs.nextInt();
					amount=amount-money1;
					break;
	
				}
			case 4:
				{
					updateAccount();
					break;
				}
			case 5:
				{
					existingAccount() ;
					break;
				}

			case 6:

				{
					return;
				}
			default:{System.out.println("Invalid Input");}
		}
			
		}

	}

	public static void updateAccount() 
	{
		SwitchBank obj=new SwitchBank(name,add,addhar,pan,pin,amount,contact);
		System.out.println("**Updadte Account**");
		Scanner cs1=new Scanner(System.in);
		Scanner p1=new Scanner(System.in);
		System.out.println("1.Name \n2.Address \n3.UpiPin \n4.Phone \n5.Account Ditails");
		System.out.println("Enter the option");
		int option=cs1.nextInt();
		switch(option)
		{
		case 1:
			{
				
				System.out.print("Enter the name :");
				String newName=p1.nextLine();
				obj.setName(newName);
				break;
			}
		case 2:
			{
				System.out.print("Enter the Loc :");
				String newLoc=p1.nextLine();
				obj.setAddress(newLoc);
				break;
			}
		case 3:
			{
				System.out.print("Enter the Loc :");
				int newpin=p1.nextInt();
				obj.setUpiPin(newpin);
				break;
			}
		case 4:
			{
				System.out.print("Enter the Loc :");
				int newContact=p1.nextInt();
				obj.setUpiPin(newContact);
				break;
			}
		case 5:
			{
				details() ;
				break;
			}
		case 6:
			{
				return;
			}
		default:{System.out.println("Invalid Input !!");}
		}

	}
	public static void details(){
	System.out.println("HI from details");	
	}
	
}