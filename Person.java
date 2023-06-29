class Person
{
	static int getAge()
	{
		System.out.println("running age");
		int age=22;
		
		if(age>0)
		{
			System.out.println("valid age");
			return age;
		}
		else
		{
			System.out.println("invalid age");
		}
		return age;
	}
	static String getName()
	{
		System.out.println("running name");
		String name="rathan h m";
		
		if(name!=null)
		{
			System.out.println("valid name");
			return name;
		}
		else
		{
			System.out.println("invalid name");
		}
		return name;
	}	
	static String getEmail()
	{
		System.out.println("running email");
		String email="rathangowda071@gmail.com";
		
		if(email!=null)
		{
			System.out.println("valid email");
			return email;
		}
		else
		{
			System.out.println("invalid email");
		}
		return email;
	}
	static String getContactno()
	{
		System.out.println("running contactno");
		String contactno="9141823931";
		
		if(contactno!=null)
		{
			System.out.println("valid contactno");
			return contactno;
		}
		else
		{
			System.out.println("invalid contactno");
		}
		return contactno;
		
	}
	static int getHeight(){
		return 180;
	}
	
	static int getWeight(){
		return 55;
	}
	
	static double getSalary(){
		return 40000;
	}
	
	static String getBestFriendName(){
		return "prajwal";
	}
	
	static String getFatherName(){
		return "manjegowda";
	}
	
	static String getMotherName(){
		return "gangamma";
	}
	
	static String getArea(){
		return "Hassan";
	}
	
	static String getEnemy(){
		return "people who hates me";
	}
	
	static String getInspiration(){
		return "Dr bro";
	}
	
	
}