package pugslist;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pug")
public class Pug {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String TYPE;
	private int weight;
	private int age;
	private String color;

	public Pug(String TYPE, int weight, int age, String color) {
		this.TYPE = TYPE;
		this.weight = weight;
		this.age = age;
		this.color = color;
	}
	
	public Pug(){}

	public String getTYPE() {
		return TYPE;
	}

	public void setTYPE(String newValue) {
		TYPE = newValue;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getPugName() {

		return TYPE + " " + weight + " " + age + " (" + color + ")";

	}

	@Override
	public String toString() {
		return "Pug [id=" + id + ", TYPE=" + TYPE + ", weight=" + weight + ", age=" + age + ", color=" + color + "]";
	}
	
	

//	public static List<Pug> getPugs() {
//		return pugs;
//	}
//
//	public static void setPugs(List<Pug> pugs) {
//		Pug.pugs = pugs;
//	}

}