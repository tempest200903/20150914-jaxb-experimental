package jaxb.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class OutputFile {

    @Override
    public String toString() {
        return "OutputFile [relativePath=" + relativePath + ", stage=" + stage
                + "]";
    }

    @XmlElement(name = "relativePath") // 省略可
    private String relativePath;

    @XmlElement(name = "stage") // 省略可
    private String stage;

    public String getBasename() {
        return relativePath;
    }

    public String getLastName() {
        return stage;
    }

}
