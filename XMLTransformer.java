package work02;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;


public class XMLTransformer {
	public static void getTransformer() {
		try {
			DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = dFactory.newDocumentBuilder();
			Document doc;
			doc =builder.parse(new File("src/config.xml"));
			String n= doc.getElementsByTagName("transformerName").item(0).getTextContent();			
			Class<?> c = Class.forName("work02."+n);
			Object obj = c.newInstance();
			((AbstractTransformer)obj).Transformer();

		}catch(Exception e) {
			e.printStackTrace();
		}
	
	}
}
