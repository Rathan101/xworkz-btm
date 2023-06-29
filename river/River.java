class River {
	public static void main (String[] info){
		System.out.println("River flowing");
		Dam.doors();
		Dam.doors("blockA");
		WaterLevel.full();
		WaterLevel.full("meters");
		Connection.destination();
		Connection.destination("name");
		WaterType.color();
		WaterSalinity.salty();
	}
}