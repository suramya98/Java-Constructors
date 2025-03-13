class Employee
{
	int emp_id;
	double emp_sal;
	char emp_grade;

	Employee(int a, double b, char c){
		emp_id = a;
		emp_sal = b;
		emp_grade = c;
	}

	public static void main(String[] args)
	{
		System.out.println("Employee Details");
		Employee e1 = new Employee(100, 45678.875, 'B');
		System.out.println("Employee 1-> Employee ID: "+e1.emp_id);
		System.out.println("Employee Salary: "+e1.emp_sal);
		System.out.println("Employee Grade: "+e1.emp_grade);

		Employee e2= new Employee(101, 78978.875, 'A');
		System.out.println("Employee 2-> Employee ID: "+e2.emp_id);
		System.out.println("Employee Salary: "+e2.emp_sal);
		System.out.println("Employee Grade: "+e2.emp_grade);
	}
}