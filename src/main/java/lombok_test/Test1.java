package lombok_test;

import model.Person;

public class Test1 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(18);
        person.setName("caolili");
        System.out.println(person);
        Person person1 = new Person();
        person1.setId("1").setName("huahua").setSchool("科大");
        System.out.println(person1);
    }
}
