class Icecream
{
	String name="ibaco";
	String flavour="choclate";
	int nooficeream=2;
	String type="cone";
	
	Icecream()
	{
		System.out.println("I like icecream");
	}
	
	public static void main(String[] args)
	{
		System.out.println("Running class");
		
		Icecream icecream=new Icecream();
		System.out.println("name of icecream is :" +icecream.name);
		System.out.println("flavour of icecream is :" +icecream.flavour);
		System.out.println("no of icecream is :" +icecream.nooficeream);
		System.out.println("type of icecreamis :" +icecream.type);
	}
}
