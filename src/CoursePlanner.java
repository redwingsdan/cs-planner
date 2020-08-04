
public class CoursePlanner {

	private String name;
	private String dept;
	private int code;
	private byte section;
	private String teacher;
	
	public CoursePlanner()
	{
		this.name = null;
		this.dept = null;
		this.code = 0;
		this.section = 0;
		this.teacher = null;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getDept()
	{
		return dept;
	}
	
	public int getCode()
	{
		return code;
	}
	
	public byte getSection()
	{
		return section;
	}
	
	public String getTeacher()
	{
		return teacher;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setDept(String dept)
	{
		this.dept = dept;
	}

	
	public void setCode(int code)
	{
		this.code = code;
	}

	
	public void setSection(byte section)
	{
		this.section = section;
	}

	
	public void setTeacher(String teacher)
	{
		this.teacher = teacher;
	}

	public Object clone()
	{
		CoursePlanner result = new CoursePlanner();
			result.name = name;
			result.code = code;
			result.dept = dept;
			result.section = section;
			result.teacher = teacher;
		//	result = (CoursePlanner)super.clone();

		return result;
	}
	
	public boolean equals(Object obj)
	{
		if(obj instanceof CoursePlanner)
		{
			CoursePlanner test = (CoursePlanner) obj;
			return (test.name.equals(name)) && (test.dept.equals(dept)) && (test.code == code) && (test.section == section) && (test.teacher.equals(teacher));
		}
		else
			return false;
	}
	
}
