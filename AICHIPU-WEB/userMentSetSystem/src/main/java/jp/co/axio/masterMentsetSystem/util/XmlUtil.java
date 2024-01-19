package jp.co.axio.masterMentsetSystem.util;

import java.io.ByteArrayInputStream;
import java.io.IOException;
//import java.io.InputStream;
//import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
//import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
//import org.w3c.dom.Node;
import org.xml.sax.SAXException;

public class XmlUtil {

	public static String evaluateXPath(String doc, String path) throws ParserConfigurationException, SAXException, XPathExpressionException, IOException {

        XPath xpath = XPathFactory.newInstance().newXPath();

        DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
    	byte[] bs = doc.getBytes(StandardCharsets.UTF_8);
    	ByteArrayInputStream bais = new ByteArrayInputStream(bs);
        Document document = builder.parse(bais);

        String ret = xpath.evaluate(path, document);
		return ret;
	}

}
