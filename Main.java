import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException,
            InvocationTargetException , ParserConfigurationException, IOException, SAXException {
        if (args.length  ==0){
            System.out.println("Must Enter Bean XML Filename to Parse.");
            return;
        }
        String fileName = args[0];

        ParseForBeans myP = new ParseForBeans();
        myP.readSomeBeans(fileName);

    }
}
