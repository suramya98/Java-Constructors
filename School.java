class School
{
	String school_name;
	char school_grade;
	int school_strength;

	//this is a parameterized constructor
	School(String a, char b, int c)
	{
		school_name = a;
		school_grade = b;
		school_strength = c;
	}

	// constructor using this keyword
	// School(String school_name, char school_grade, int school_strength)
	// {
	// 	this.school_name = school_name;
	// 	this.school_grade = school_grade;
	// 	this.school_strength = school_strength;
	// }
	
	public static void main(String[] args)
	{
		System.out.println("School Details");
		School s1 = new School("Vidya Mandir", 'A', 700);
		System.out.println("School 1-> School Name: "+s1.school_name);
		System.out.println("School Grade: "+s1.school_grade);
		System.out.println("School Strength: "+s1.school_strength);

		School s2 = new School("Florence", 'B', 500);
		System.out.println("School 2-> School Name: "+s2.school_name);
		System.out.println("School Grade: "+s2.school_grade);
		System.out.println("School Strength: "+s2.school_strength);
	}
}
