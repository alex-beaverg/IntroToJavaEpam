package by.epam.bobrikov.stage06.Task03.Server.objects;

public class Student {
    private String surname;
    private String name;
    private int age;
    private int group;

    public Student(String surname, String name, int age, int group) {
        this.surname = surname;
        this.name = name;
        this.age = age;
        this.group = group;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getGroup() {
        return group;
    }

    @Override
    public String toString() {
        return "Student: " + surname + " " + name + ", age = " + age + ", group = " + group;
    }
}
