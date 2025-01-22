package practice;

public class ClonableInterface {
	
	/* The clone() method of Object class is used to clone an object. 
	 * The clone() method saves the extra processing task for creating the exact copy of an object. 
	 * If we perform it by using the new keyword, it will take a lot of processing time to be performed 
	 * that is why we use object cloning. */

	public static void main(String[] args) {
		
		try {
            Person person1 = new Person("John", 30);
            Person person2 = (Person) person1.clone();
            System.out.println(person2);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
	}

}

class Person implements Cloneable {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + '}';
    }
}
