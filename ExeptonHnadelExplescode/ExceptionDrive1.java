class UserNullPointerException extends RuntimeException
{
	UserNullPointerException(String desc)
	{
		super(desc);
	}
}

class Student
{
	String name;
	String loc;
	Student(String name,String loc)
	{
		this.name=name;
		this.loc=loc;
	}
}

class ExceptionDrive1
{


	public static void main(String[] args) 
	{
		Student obj=new Student("Ramesh","pune");
		System.out.println(obj.name);
		Student obj1=null;

		if (obj1==null) 
		{
			try
			{	
				throw new UserNullPointerException("this is null pointer exception");
			}
			catch(UserNullPointerException i)
			{
				System.out.println(i.getMassage());
			}	
		}
	}
}