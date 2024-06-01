class Mobile
{
	static boolean playGames;
	static boolean watchReel;

	public static void playGames(boolean flag) 
	{
		if (playGames==true) 
		{
			System.out.println("playGames");
		}
		else{
			System.out.println("not playGames");
		}
	}
	public static void watchReel(boolean flag)
	{
		if (watchReel==true) {
			System.out.println("watchReel");
		}
		else{
			System.out.println("not watchReel");
		}

	}
}

class MobileDrive
{
	static Mobile obj;
	
	public static void main(String[] args) 
	{
		System.out.println("main start");
		try{
			System.out.println(obj.playGames);
		}
		catch(Exception e)
		{
			System.out.println();
			try{
				Mobile obj=new Mobile();
				obj.playGames(true);
				obj.watchReel(true);
			}
			catch(Exception e1)
			{			
				System.out.println("exception Handaled");
			}		
		}
	}
}