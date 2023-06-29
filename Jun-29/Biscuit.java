class Biscuit {
    String name="chaska maska";
	String shape= "square";
    int quantity = 20;
    int cost=10;
    Biscuit(){
        System.out.println("Running biscuit");
    }
    public static void main(String[] args) {
        Biscuit biscuit = new Biscuit();
        System.out.println("name of biscuit is:" +biscuit.name);
        System.out.println("shape of biscuit is:" +biscuit.shape);
        System.out.println("quantity of biscuit in a pack:" +biscuit.quantity);
        System.out.println("cost of one biscuit packet is:" +biscuit.cost);
    }
    
}