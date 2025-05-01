package Creational.Builder;

public class Main {
    public static void main(String[] args) {
        StudentBuilder enggStudentBuilder = new EngineeringStudentBuilder();
        StudentBuilder mbaStudentBuilder = new MBAStudentBuilder();

        Student engStudent = enggStudentBuilder.setRollNumber(1).setAge(22).setName("s").setSubjects().build();
        System.out.println(engStudent);

        Student mbaStudent = mbaStudentBuilder.setRollNumber(2).setAge(23).setName("s").setSubjects().build();
        System.out.println(mbaStudent);
    }
}
