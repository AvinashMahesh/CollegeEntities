public class EntityInfo {

	public static void main(String[] args) {

		Person p1 = new Teacher ("Sanjeev", 25, 'M', "Math", 2);
		Person p2 = new Student ("Billy", 16, 'M', "3029424", 3.7);
		Person p3 = new CollegeStudent ("Amanda", 19, 'F', "3093503", 3.2, "Freshman", "Computer Science", 2024);
		
		
		((CollegeStudent) p3).getInfo();
		
		printInfo(p1);
		printInfo(p2);
		printInfo(p3);
	}
	public static void printInfo (Person p) {
			System.out.println(p);
			System.out.println();
		}
}
