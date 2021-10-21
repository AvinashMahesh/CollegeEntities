public class Teacher extends Person {
	private String subject;
	private int yearsExp;
	
	public Teacher(String n, int a, char g, String s, int y) {
		super(n, a, g);
		subject = s;
		yearsExp = y;
		
	}
	
	public String getSubject() {
		return subject;
	}
	public int getYears() {
		return yearsExp;
	}
	
	public String toString() {
		return super.getName() + " teaches " + subject + " and has " +yearsExp + " years of experience.";
	}
}

