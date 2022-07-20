package ss5_access_modifier_static_method_static_property.exercise;

public class Student {
    private String name;
    private String classes;

    public Student() {
        name = "John";
        classes = "CO2";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.setClasses("A04");
        student.setName("Huynh Ba Dai Phu");
        System.out.println(student.getClasses());
        System.out.println(student.getName());

        Student student1 = new Student();
        System.out.println(student1.getClasses());
        System.out.println(student1.getName());
    }
}
