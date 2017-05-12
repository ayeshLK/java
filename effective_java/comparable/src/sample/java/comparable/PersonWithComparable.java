package sample.java.comparable;

public class PersonWithComparable implements Comparable, Person{
    private String name;
    private int age;

    public PersonWithComparable(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Object o) {
        if(((PersonWithComparable) o).age == this.age){
            return 0;
        }else {
            return this.age >  ((PersonWithComparable) o).age ? 1: -1;
        }
    }
}
