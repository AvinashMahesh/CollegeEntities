public class CollegeStudent extends Student implements Comparable <CollegeStudent>, Employable {

	
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

	@Override
	public int compareTo(CollegeStudent o) {
		String a = o.getName();
		String b = this.getName();
		if(b.compareTo(a) < 0)
			return -1;
		if(b.compareTo(a) > 0)
			return 1;
		if(b.compareTo(a) == 0)
			return 0;
		return 0;
	}

	@Override
	public boolean isEmployable() {
		if (this.getAge() >= 18 && this.getAge() <= 22 && this.getGPA() >=2.5)
			return true;
		else
		return false;
	}
	
}
