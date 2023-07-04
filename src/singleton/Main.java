package singleton;

public class Main {
    public static void main(String[] args) {
        Student engineeringStudent=Student.getInstance();
        engineeringStudent.setName("Richard Stallman");
        engineeringStudent.setAge(20);
        System.out.println("engineeringStudent = " + engineeringStudent);
        Student literatureStudent=Student.getInstance();
        literatureStudent.setAge(25);
        System.out.println("literatureStudent = " + literatureStudent);
        System.out.println("engineeringStudent==literatureStudent: "+ (engineeringStudent==literatureStudent));

        System.out.println("==============================By default==============================================");

        Person Adama=new Person("Adama");
        System.out.println("Adama = " + Adama);
        Person Julian=new Person();
        System.out.println("Julian = " + Julian);
        System.out.println("Adam==Julian: "+ (Adama==Julian));

    }
}