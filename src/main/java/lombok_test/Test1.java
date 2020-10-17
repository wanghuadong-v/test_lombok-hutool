package lombok_test;

import model.Person;

public class Test1 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(18);
        person.setName("caolili");
        System.out.println(person);
    }
}
