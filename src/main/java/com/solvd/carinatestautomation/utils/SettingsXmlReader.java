package com.solvd.carinatestautomation.utils;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class SettingsXmlReader {
    public static String apiId;

    static {
        final String relativeFilePath = ".m2/settings.xml";
        final String currentDirectory = System.getProperty("user.home");
        try {
            File file = new File(currentDirectory, relativeFilePath);

            if (!file.exists()) {
                throw new RuntimeException("Settings.xml does not exist.");
            }

            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            Document document = documentBuilder.parse(file);
            document.getDocumentElement().normalize();

            NodeList nodeList = document.getElementsByTagName("api_id");
            if (nodeList.getLength() > 0) {
                Element element = (Element) nodeList.item(0);
                apiId = element.getTextContent();
            } else {
                throw new RuntimeException("api_id element not found in settings.xml");
            }
        } catch (ParserConfigurationException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (SAXException e) {
            throw new RuntimeException(e);
        }
    }

    public static String getApiId() {
        return apiId;
    }
}
