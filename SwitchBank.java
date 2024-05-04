
import java.util.*;
class SwitchBank
{
	static{
		System.out.println("*********WELCOME TO SWITCH BANK*******");
	}
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
	public static void main(String[] args) 
	{	
		myBank:	
		for (; ; ) 
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Create Acount \n2.Existing account \n3.Eqsxxit");
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
	  System.out.println("1.Name\n2.address\n3.addhar\n4.PanNumber\n5.upiPin\n6.Balance\n7.PhoneNumber");
	  Scanner sc=new Scanner(System.in);
	  System.out.print("Enter Your Good Name : ");

	}

	public static void existingAccount() 
	{
		System.out.println("**Account Detels**");	
		System.out.println("1.Check Balence \n2.Deposite Amount \n3.Widrow Amount \n4.Update Account \n5.logout");

	}

	public static void updateAccount(String[] args) 
	{
		System.out.println("**Updadte Account**");
		System.out.println("1.Name \n2.Account \n3.UpiPin \n4.Phone");
	}
}