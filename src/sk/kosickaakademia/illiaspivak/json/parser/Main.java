package sk.kosickaakademia.illiaspivak.json.parser;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Main {
    public static void main(String[] args) {
        JSONParser parser = new JSONParser();
        try (Reader reader = new FileReader("resourse/City.json")) {

            JSONObject jsonObject = (JSONObject) parser.parse(reader);
            System.out.println(jsonObject);

            JSONArray data = (JSONArray) jsonObject.get("data");

            for (int i = 0; i < data.size(); i++) {
                JSONObject temp = (JSONObject) data.get(i);

                System.out.println("Mesto: " + temp.get("name"));
                System.out.println("Region: " + temp.get("region"));
                System.out.println("wikiDataId: " + temp.get("wikiDataId"));
                System.out.println("Sirka: " + temp.get("latitude"));
                System.out.println("Dlzka: " + temp.get("longitude"));
                System.out.println();
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        ;
    }
}
