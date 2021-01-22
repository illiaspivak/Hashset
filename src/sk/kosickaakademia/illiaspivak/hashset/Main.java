package sk.kosickaakademia.illiaspivak.hashset;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        /**
         * a) vypise na obrazovku pocet mien (Duplicity ignotujeme)
         */
        HashSet<String> h = new HashSet<String>();
        try {
            FileReader fr = new FileReader("resourse/names.txt");
            Scanner scanner = new Scanner(fr);
            String line;
            while (scanner.hasNext()) {
                line = scanner.nextLine();
                h.add(line);
            }
            fr.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        System.out.println(h);
        /**
         * b) vypise vsetky mena
         */
        ArrayList<String> list = new ArrayList<String>();
        try {
            FileReader fr = new FileReader("resourse/names.txt");
            Scanner scanner = new Scanner(fr);
            String line;
            while (scanner.hasNext()) {
                line = scanner.nextLine();
                list.add(line);
            }
            fr.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + 1 + " " + list.get(i));
        }
        /**
         * c) vypiste zoznam mien usporiadany podla abecedy
         */
        Collections.sort(list);
        for (String temp : list) {
            System.out.println(temp);
        }
        /**
         * d) vypiste najdlhsie meno
         */
        int max = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() > max) {
                max = list.get(i).length();
            }
        }
        for (String s : list) {
            if (s.length() == max) {
                System.out.println("najdlhsie meno: " + s);
            }
        }
        /**
         * e) vypiste meno ktore sa opakuje najviac krat
         */
        String a;
        int m = 0;
        for (int i = 0; i < list.size(); i++){
            a = list.get(i);
            int n = 0;
            for (int j = 0; j < list.size(); j++){
                if(a.equals(list.get(j))){
                    n++;
                }
            }
            if(n>m){
                m=n;
            }
        }
        for (int i = 0; i < list.size(); i++){
            a = list.get(i);
            int n = 0;
            for (int j = 0; j < list.size(); j++){
                if(a.equals(list.get(j))){
                    n++;
                }
            }
            if(n==m){
                System.out.println("opakuje najviac krat, " + m +", meno "+list.get(i));
                break;
            }
        }
    }
}
