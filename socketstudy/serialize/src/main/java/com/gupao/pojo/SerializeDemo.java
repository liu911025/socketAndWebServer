package com.gupao.pojo;

import java.io.*;

/**
 * Created by liujiatai on 2018/12/25.
 */
public class SerializeDemo {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        serializePreson();
        restorePerson();
    }

    public static void serializePreson() throws IOException, ClassNotFoundException {
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(new File("person.txt")));
        SuperPerson person = new SuperPerson();
        person.setAge(12);
        person.setName("66");
        person.setSkill("444");
        out.writeObject(person);
        out.flush();

        Person p = person.clone();
        System.out.println("person:p..." + (person.equals(p)));

        ObjectInputStream in = new ObjectInputStream(new FileInputStream(new File("person.txt")));
        SuperPerson person1 = (SuperPerson)in.readObject();
        System.out.println("1<<<" + person1.getName() + "--" + person1.getAge() + "--" + person1.getSkill());
        System.out.println(person == person1);

        person.setName("feifei");
        out.writeObject(person);
        out.flush();
        out.close();
    }

    public static void restorePerson() throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(new File("person.txt")));
        SuperPerson person = (SuperPerson)in.readObject();
        System.out.println("1<<<" + person.getName() + "--" + person.getAge() + "--" + person.getSkill());
    }
}
