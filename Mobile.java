class Mobile
{
	double mobile_cost;
	String model_name;
	String color;

	Mobile(double a, String b, String c){
		mobile_cost = a;
		model_name = b;
		color = c;
	}

	public static void main(String[] args)
	{
		System.out.println("Mobile Details");

		Mobile m1 = new Mobile(17000.567, "Samsung", "Black");
		System.out.println("Mobile 1-> Mobile Cost: "+m1.mobile_cost);
		System.out.println("Model Name: "+m1.model_name);
		System.out.println("Mobile Color: "+m1.color);

		Mobile m2 = new Mobile(25000.567, "Motorola", "White");
		System.out.println("Mobile 2-> Mobile Cost: "+m2.mobile_cost);
		System.out.println("Model Name: "+m2.model_name);
		System.out.println("Mobile Color: "+m2.color);
	}
}
