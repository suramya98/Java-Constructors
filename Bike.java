class Bike
{
	int bike_cost;
	String bike_brand;
	String bike_color;

	Bike(int a, String b, String c)
	{
		bike_cost = a;
		bike_brand = b;
		bike_color = c;
	}

	public static void main(String[] args)
	{
		System.out.println("Bike Details");

		Bike b1 = new Bike(50000, "Yamaha", "Black");
		System.out.println("Bike 1-> Bike Cost: "+b1.bike_cost);
		System.out.println("Bike Brand: "+b1.bike_brand);
		System.out.println("Bike Color: "+b1.bike_color);

		Bike b2 = new Bike(40000, "Access125", "BLue");
		System.out.println("Bike 2-> Bike Cost: "+b2.bike_cost);
		System.out.println("Bike Brand: "+b2.bike_brand);
		System.out.println("Bike Color: "+b2.bike_color);
	}
}