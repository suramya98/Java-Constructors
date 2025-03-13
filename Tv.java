class Tv
{
	int tv_cost;
	String tv_brand;
	String tv_type;

	Tv(int a, String b, String c){
		tv_cost = a;
		tv_brand = b;
		tv_type = c;
	}

	public static void main(String[] args)
	{
		System.out.println("TV Details");
		Tv t1 = new Tv(50000, "Samsung", "LED");
		System.out.println("TV 1-> TV Cost: "+t1.tv_cost);
		System.out.println("TV Brand: "+t1.tv_brand);
		System.out.println("TV Type: "+t1.tv_type);

		Tv t2 = new Tv(60000, "Sony", "LCD");
		System.out.println("TV 2-> TV Cost: "+t2.tv_cost);
		System.out.println("TV Brand: "+t2.tv_brand);
		System.out.println("TV Type: "+t2.tv_type);
	}
}