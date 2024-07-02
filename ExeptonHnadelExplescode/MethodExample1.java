class MethodExample1
{
	public static void main(String[] args) 
	{
		String nameGF="";
		String wifeName="Kamini";
		if (nameGF.isEmpty()) 
		{

		try{
			throw new Exception1("Name not Find Exception Hnadeld");
		}
		catch(Exception e){
			e.printStackTrace();
			if (wifeName.isEmpty(
			)) 
			{
				System.out.println("name not find");	
			}else{
				System.out.println("name got it");
			}
		}	
		}
	}
}