class Laptop
{
	String laptop_name;
	double laptop_cost;
	String laptop_brand;

	Laptop(String a, double b, String c)
	{
		laptop_name = a;
		laptop_cost = b;
		laptop_brand = c;
	}

	public static void main(String[] args)
	{
		System.out.println("Laptop Details");
		Laptop l1 = new Laptop("HP Pavilion", 67567, "HP");
		System.out.println("Laptop 1-> Laptop Name: "+l1.laptop_name);
		System.out.println("Laptop Cost: "+l1.laptop_cost);
		System.out.println("Laptop Brand: "+l1.laptop_brand);

		Laptop l2 = new Laptop("Inspiron", 59776, "Dell");
		System.out.println("Laptop 2-> Laptop Name: "+l2.laptop_name);
		System.out.println("Laptop Cost: "+l2.laptop_cost);
		System.out.println("Laptop Brand: "+l2.laptop_brand);
	}
}