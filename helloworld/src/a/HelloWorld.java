package a;

import model.Person;

/**
 * Created by zcfrank1st on 27/03/2017.
 */
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("this is a demo hello world");

        Person p = new Person();
        p.setId(1);
        p.setName("hello world");

        System.out.println(p);
    }
}
