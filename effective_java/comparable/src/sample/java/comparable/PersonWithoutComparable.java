package sample.java.comparable;

public class PersonWithoutComparable implements Person {
    private String name;
    private int age;

    public PersonWithoutComparable(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
