package jaxb.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class Person {
    @XmlAttribute(name = "id")
    private int id;

    @XmlElement(name = "firstName") // 省略可
    private String firstName;
    @XmlElement(name = "lastName") // 省略可
    private String lastName;
    @XmlElement(name = "age") // 省略可
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return String.format(
                "!!id = [%d], firstName = [%s], lastName = [%s], age = [%d]!!",
                id, firstName, lastName, age);
    }
}
