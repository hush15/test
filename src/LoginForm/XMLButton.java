package LoginForm;

import java.io.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.soap.Node;

import org.w3c.dom.*;


public class XMLButton {
	public static void getButton() {
		try {
			DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = dFactory.newDocumentBuilder();
			Document doc;
			doc =builder.parse(new File("src/config.xml"));
			String n= doc.getElementsByTagName("className").item(0).getTextContent();			
			Class<?> c = Class.forName("LoginForm."+n);
			Object obj = c.newInstance();
			((Button) obj).display();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
