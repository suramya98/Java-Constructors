class Clothes
{
	String cloth_color;
	int cloth_cost;
	String cloth_size;

	Clothes(String a, int b, String c)
	{
		cloth_color = a;
		cloth_cost = b;
		cloth_size = c;
	}

	public static void main(String[] args)
	{
		System.out.println("Clothes Details");
		Clothes c1 = new Clothes("Black", 399, "XS");
		System.out.println("Cloth 1-> Cloth Color: "+c1.cloth_color);
		System.out.println("Cloth Cost: "+c1.cloth_cost);
		System.out.println("Cloth Size: "+c1.cloth_size);

		Clothes c2 = new Clothes("Grey", 599, "XL");
		System.out.println("Cloth 2-> Cloth Color: "+c2.cloth_color);
		System.out.println("Cloth Cost: "+c2.cloth_cost);
		System.out.println("Cloth Size: "+c2.cloth_size);
	}
}