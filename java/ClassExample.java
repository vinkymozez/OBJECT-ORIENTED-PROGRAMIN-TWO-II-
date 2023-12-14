package java;
public class ClassExample {
    String name;
    int age;

    public ClassExample(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void introduce() {
        System.out.println("Hi, I'm " + name + " and I'm " + age + " years old.");
    }

    public static void main(String[] args) {
        ClassExample person1 = new ClassExample("John", 25);
        System.out.println("Name: " + person1.name);
        System.out.println("Age: " + person1.age);
        person1.introduce();
    }
}
