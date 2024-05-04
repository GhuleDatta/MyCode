class OopsMyInfo1
{
	private String name,nativePlace,branch;

	OopsMyInfo1(String name,String nativeplace,String branch)
	{
		this.name=name;
		this.nativePlace=nativePlace;
		this.branch=branch;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String updateName)
	{
		this.name=updateName;
	}
	public String getNativePlace() 
	{
		return nativePlace;	
	}
	public void setNativePlace(String updatenativeplace) 
	{
		this.nativePlace=updatenativeplace;
	}
	public String getBranch()
	{
		return branch;
	}
	public void setBranch(String updateBranch)
	{
		this.branch=updateBranch;	
	}
}

class OopsMyInfo
{
	public static void main(String[] args) 
	{
	OopsMyInfo1 obj=new OopsMyInfo1("Ram","Pune","CSE");
	obj.setName("Ram");
	obj.setNativePlace("Pune");
	obj.setBranch("CSE");
	System.out.println(obj.getName());
	System.out.println(obj.getNativePlace() );
	System.out.println(obj.getBranch());

	}
}