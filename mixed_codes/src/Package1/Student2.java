package Package1;

public class Student2 {
	private int age;
	 private String name;
	 public Student2 (String name, int age) {
			this.age= age;
			this.name= name;
		}
			
	public void speak () {
		System.out.println(name + "\n"+ age );
	}
	 
	 public int getAge() {
	return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}
	protected void talk () {
		System.out.println("talked "); 
	}

	@Override
	public String toString() {
		return "Student2 [age=" + age + ", name=" + name + "]";
	}

}