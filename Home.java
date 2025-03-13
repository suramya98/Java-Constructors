class Home
{
	String home_name;
	double cost;
	String home_color;

	Home(String a, double b, String c)
	{
		home_name = a;
		cost = b;
		home_color = c;
	}

	public static void main(String[] args)
	{
		System.out.println("Home Details");
		Home h1 = new Home("Kaundinya", 675670.567, "Grey");
		System.out.println("Home 1-> Home Name: "+h1.home_name);
		System.out.println("Home Cost: "+h1.cost);
		System.out.println("Home Color: "+h1.home_color);

		Home h2 = new Home("SLN Residency", 6756470.567, "White");
		System.out.println("Home 2-> Home Name: "+h2.home_name);
		System.out.println("Home Cost: "+h2.cost);
		System.out.println("Home Color: "+h2.home_color);
	}
}