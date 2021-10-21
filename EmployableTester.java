public class EmployableTester {

	public static void main(String[] args) {
		CollegeStudent c1 = new CollegeStudent ("Finley", 18, 'M', "2239422", 4.0, "Freshman", "Finance", 2024); 
		CollegeStudent c2 = new CollegeStudent ("Barbara", 23, 'F', "2532234", 3.6, "5th Year", "Mechanical Engineering", 2021); 
		CollegeStudent c3 = new CollegeStudent ("Kendra", 22, 'F', "3311239", 2.1, "Senior", "Math", 2020);
		
		System.out.println("College Students: ");
		System.out.println(c1.isEmployable());
		System.out.println(c2.isEmployable());
		System.out.println(c3.isEmployable());
		
		Teacher t1 = new Teacher ("Jose" , 49, 'M', "Pre-Calc", 25);
		Teacher t2 = new Teacher ("Manny" , 24, 'M', "History", 2);
		Teacher t3 = new Teacher ("Debra" , 19, 'F', "Chemistry", 6);
		
		System.out.println("Teachers: ");
		System.out.println(t3.isEmployable());
		System.out.println(t2.isEmployable());
		System.out.println(t1.isEmployable());

	}
}

