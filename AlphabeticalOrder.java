public class CollegeStudentTester {

	public static void main(String[] args) {
		
		CollegeStudent c1 = new CollegeStudent ("Norman", 18, 'M', "2239422", 4.0, "Freshman", "Finance", 2024); 
		CollegeStudent c2 = new CollegeStudent ("Tyrese", 21, 'M', "2532234", 3.6, "Junior", "Mechanical Engineering", 2021); 
		CollegeStudent c3 = new CollegeStudent ("Carly", 22, 'F', "3311239", 3.5, "Senior", "Math", 2020); 
		
		if (c1.compareTo (c2) < 0 && c1.compareTo (c3) < 0) {
			System.out.print(c1.getName() + " ");
			if(c2.compareTo(c3) < 0)
			{
				System.out.print(c2.getName() + " " + c3.getName());
			}
			else 
				System.out.print(c3.getName() + " " + c2.getName());
		}
		System.out.println();
		
		if (c2.compareTo (c1) < 0 && c2.compareTo (c3) < 0) {
			System.out.print(c2.getName() + " ");
			if (c1.compareTo(c3) < 0)
				System.out.print(c1.getName() + " " + c3.getName());
			else 
				System.out.print(c3.getName() + " " + c1.getName());
		}	
		System.out.println();
		
		if (c3.compareTo (c1) < 0 && c3.compareTo (c2) < 0) {
			System.out.print(c3.getName() + " ");
			if(c1.compareTo(c2) < 0)
				System.out.print(c1.getName() + " " + c2.getName());
			else
				System.out.print(c2.getName() + " " + c1.getName());
		}
		System.out.println(); 
		
	}

}
