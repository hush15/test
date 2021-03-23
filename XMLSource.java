package work02;
import java.io.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.soap.Node;

import org.w3c.dom.*;


public class XMLSource {
	public static void get() {
		try {
			DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = dFactory.newDocumentBuilder();
			Document doc;
			doc =builder.parse(new File("src/config.xml"));
			String n= doc.getElementsByTagName("sourceName").item(0).getTextContent();			
			Class<?> c = Class.forName("work02."+n);
			Object obj = c.newInstance();
			((AbstractSource)obj).Source();

		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
