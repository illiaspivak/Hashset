package sk.kosickaakademia.illiaspivak.json;

import org.json.XML;

public class Main {
    public static void main(String[] args) {
        String xml_text = "<player>\n" +
                "<name>Milian</name>\n" +
                "<age>32</age>\n" +
                "<sport>hochey</sport>\n" +
                "<active>true</active>\n" +
                "</player>";
        String jsonPrettyPrintString  = XML.toJSONObject(xml_text).toString();
        System.out.println(jsonPrettyPrintString);
    }
}
