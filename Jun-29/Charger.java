class Charger
{
	String type="c-type,u-type";
	int cost=500;
	String warrenty="1-2 yrs";
	String fit="deepends on type";
	
	Charger() {
		System.out.println("the charger");
	}
	public static void main(String[] args)
	{
		System.out.println("Running charger");
		Charger charger=new Charger();
		System.out.println("The charger type is :" +charger.type);
		System.out.println("The cost of charger is :" +charger.cost);
		System.out.println("The warrenty of charger is :" +charger.warrenty);
		System.out.println("The charger fit to :" +charger.fit);
		
	}
}