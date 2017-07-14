package p170713;

public class Member1DTO {

	String name;
	int age, height, weight;
	String sex;

	public Member1DTO() {
		super();
	}

	public Member1DTO(String name, int age, int height, int weight, String sex) {
		super();
		this.name = name;
		this.age=age;
		this.height = height;
		this.weight =weight;
		this.sex = sex;
		

		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int heigh) {
		this.height = heigh;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
}
