package jaxb;

import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.bind.DataBindingException;
import javax.xml.bind.JAXB;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class JaxbSupport {
    public static <T> T unmarshalSimply(String inputString,
            Class<T> requiredType) throws DataBindingException {
        return JAXB.unmarshal(new StringReader(inputString), requiredType);
    }

    public static <T> T unmarshalSimply(Reader reader,
            Class<T> requiredType) throws DataBindingException {
        return JAXB.unmarshal(reader, requiredType);
    }

    public static <T> T unmarshal(String inputString, Class<T> requiredType)
            throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(requiredType);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        return requiredType.cast(unmarshaller.unmarshal(new StringReader(
                inputString)));
    }

    public static String marshalSimply(Object target)
            throws DataBindingException {
        StringWriter writer = new StringWriter();
        JAXB.marshal(target, writer);
        return writer.toString();
    }

    public static String marshal(Object target) throws JAXBException {
        StringWriter writer = new StringWriter();
        JAXBContext context = JAXBContext.newInstance(target.getClass());
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(target, writer);
        return writer.toString();
    }
}
