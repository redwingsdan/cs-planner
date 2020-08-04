
public class Initial {
	public static void main(String [] args)
	{
		CoursePlanner math = new CoursePlanner();
		math.setName("Mathematic Structures");
		math.setDept("AMS");
		math.setCode(301);
		math.setSection((byte) 4);
		math.setTeacher("Alan Tucker");
		
		System.out.println("Name = " + math.getName() + "\nDepartment = " + math.getDept() + "\nCode = " + math.getCode() + "\nSection = " + math.getSection() + "\nTeacher = " + math.getTeacher());
	
		CoursePlanner phy = new CoursePlanner();
		phy.setName("Classical Physics I");
		phy.setDept("PHY");
		phy.setCode(131);
		phy.setSection((byte) 1);
		phy.setTeacher("Thomas Hemmick");
		
		Planner p1 = new Planner();
		
		p1.addCourse(math);
		p1.addCourse(phy);
		p1.printAllCourses();
//		p1.getCourse(2).toString();
		Planner p2 = new Planner();
		p2 = (Planner)p1.clone();
		
		CoursePlanner hus = new CoursePlanner();
		hus.setName("Latin America Today");
		hus.setDept("HUS");
		hus.setCode(254);
		hus.setSection((byte) 2);
		hus.setTeacher("Lena-Burgos Lafuente");
		p1.addCourse(hus);
		
		p2.printAllCourses();
		p1.printAllCourses();
		p2.printAllCourses();
//		System.out.println(p1.size());
		p1.removeCourse(2);
		p1.printAllCourses();
		p1.addCourse(phy);
		p1.printAllCourses();
//		System.out.println(p1.size());
	}
}
