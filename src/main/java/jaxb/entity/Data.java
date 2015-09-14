package jaxb.entity;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "data")
public class Data {
    @XmlElement(name = "title") // 省略可
    private String title;

    @XmlElementWrapper(name = "persons")
    @XmlElement(name = "person")
    private List<Person> persons;

    public String getTitle() {
        return title;
    }

    public List<Person> getPersions() {
        return persons;
    }

    @Override
    public String toString() {
        return String.format("title = [%s], persons = %s", title, persons);
    }
}
