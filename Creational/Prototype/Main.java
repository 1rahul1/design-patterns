package Creational.Prototype;

public class Main {
    public static void main(String[] args) {
        Student obj = new Student(20, 101, "John Doe");
        Student cloneObj = (Student) obj.clone();

        System.out.println("Original Object: " + obj.name);
        System.out.println("Cloned Object: " + cloneObj.name);
    }
}
