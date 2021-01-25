package sk.kosickaakademia.illiaspivak.json;

import org.json.XML;

public class Main {
    public static void main(String[] args) {
        String xml_text = "<player>\n" +
                "<name>Milian</name>\n" +
                "<age>32</age>\n" +
                "<sport type=\"array\">\n" +
                "    <value>hockey</value>\n" +
                "    <value>football</value>\n" +
                "    <value>golf</value></sport>\n" +
                "<active>true</active>\n" +
                "</player>";
        String jsonText  = XML.toJSONObject(xml_text).toString();
        System.out.println(jsonText);
    }
}
