package java;
public class ObjectExample {
    String brand;

    public void start() {
        System.out.println(brand + " is starting.");
    }

    public static void main(String[] args) {
        ObjectExample myCar = new ObjectExample();
        myCar.brand = "Toyota";
        myCar.start();
    }
}
