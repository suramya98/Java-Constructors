class Car
{
	double cost;
	String model_name;
	String type;

	Car(double a, String b, String c)
	{
		cost = a;
		model_name = b;
		type = c;
	}

	public static void main(String[] args)
	{
		System.out.println("Car Details");

		Car c1 = new Car(800000.987, "Swift Dzire", "Petrol");
		System.out.println("Car 1-> Car Cost: "+c1.cost);
		System.out.println("Model Name: "+c1.model_name);
		System.out.println("Type: "+c1.type);

		Car c2 = new Car(8000000.875, "Kia", "Diesel");
		System.out.println("Car 2-> Car Cost: "+c2.cost);
		System.out.println("Model Name: "+c2.model_name);
		System.out.println("Type: "+c2.type);
	}
}