class Car {
	public static void main (String[] systems){
		System.out.println("car running");

		Wheel.airPresure();
		Wheel.airPresure("frontRight");
		Door.status();
		Door.status("driverDoor");
		TurnLights.mode();
		TurnLights.mode("parking");
		Engine.temp();
		Engine.temp("degree");
		Battery.percentage();
	}
}