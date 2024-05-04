class MyInfoMyDrive1
{
	private String name;
	private String branch;
	String getName();
	void setName(String UpdateName);

	String getBranch();
	void setBranch(String updateBranch);
}
class OopsEx1
{
	public static void main(String[] args) {
		MyInfoMyDrive1 obj=new MyInfoMyDrive1("Ram","Mechanical");
		System.out.println(obj.name);
		System.out.println(obj.getName());
	}
}