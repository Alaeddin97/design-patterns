package singleton;

public class Student {
    static private Student instance;
    private String name;
    private Integer age;

    private Student(){}

    public static Student getInstance(){
        if(Student.instance==null)
            Student.instance=new Student();
        return Student.instance;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "singleton.Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
