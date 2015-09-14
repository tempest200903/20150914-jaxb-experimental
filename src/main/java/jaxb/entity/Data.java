package jaxb.entity;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "progress")
public class Data {

    @XmlElementWrapper(name = "outputFiles")
    @XmlElement(name = "outputFile")
    private List<OutputFile> outputFiles;

    public List<OutputFile> getOutputFiles() {
        return outputFiles;
    }

    @Override
    public String toString() {
        return "Data [outputFiles=" + outputFiles + "]";
    }

}
