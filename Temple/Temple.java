class Temple {
	public static void main (String[] info){
		System.out.println("Running Temple");
		Doors.open();
		Doors.open("front");
		Pooja.status();
		Pooja.status("god");
		Prasada.distributed();
		Prasada.distributed("type");
		Location.city();
		God.name();
	}
}