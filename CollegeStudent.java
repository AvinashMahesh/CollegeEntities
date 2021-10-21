public class CollegeStudent extends Student{

	
	private String year;
	private String major;
	private int GradYear;
	
	public CollegeStudent(String n, int age, char gender, String ID, double gpa, String y, String m, int g) {
		super(n, age, gender, ID, gpa);
		year = y;
		major = m;
		GradYear = g;
	}
	
	public String getYear() {
		return year;
	}
	public String getMajor() {
		return major;
	}
	public int getGradYear() {
		return GradYear;
	}
	
	public String toString() {
		return super.getName() + " is a " + year + " in college studying " + major + " and is projected to graduate in " + GradYear;
	}
	
	public void getInfo() {
		System.out.println("Name: " + super.getName() + " Age: " + super.getAge() + " Gender: " + super.getGender() + " ID: " + super.getIDNum() + " GPA: " + super.getGPA() + " Year: " + getYear() + " Major: " + getMajor() + " Graduation Year: " + getGradYear());
	}
}
