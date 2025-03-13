class Course
{
	String course_name;
	String uni_name;
	int exam_cost;

	Course(String a, String b, int c)
	{
		course_name = a;
		uni_name = b;
		exam_cost = c;
	}

	public static void main(String[] args)
	{
		System.out.println("Course Details");
		Course c1 = new Course("Computer Science & Engg", "VTU", 3456);
		System.out.println("Course 1-> Course Name: "+c1.course_name);
		System.out.println("University Name: "+c1.uni_name);
		System.out.println("Exam Cost: "+c1.exam_cost);

		Course c2 = new Course("Software Engineering", "Ireland", 56789);
		System.out.println("Course 2-> Course Name: "+c2.course_name);
		System.out.println("University Name: "+c2.uni_name);
		System.out.println("Exam Cost: "+c2.exam_cost);
	}
}