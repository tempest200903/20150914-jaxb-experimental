package jaxb;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

import com.sun.xml.internal.ws.spi.db.DatabindingException;

import jaxb.entity.Data;

public class Main {

    public static void main(String[] args) throws IOException {
        try {
            String inputFilepath = args.length > 0 ? args[0]
                    : "sample-input.xml";
            String outputFilepath = args.length > 1 ? args[1]
                    : "sample-output.xml";

            Reader reader = new FileReader(inputFilepath);
            Data data = JaxbSupport.unmarshalSimply(reader, Data.class);
            System.out.println(data);

            Writer writer = new FileWriter(outputFilepath);
            writer.write(JaxbSupport.marshalSimply(data));
            writer.close();
        } catch (DatabindingException e) {
            e.printStackTrace();
        }
    }

}
