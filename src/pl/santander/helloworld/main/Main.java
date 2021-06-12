package pl.santander.helloworld.main;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.List;
import java.util.ArrayList;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        String productName = " abc123 IsD567 ";
        String date = "11.06.2021";

        System.out.println(productFormatter(productName, date));

        int[] input = {1,2,3,4,5};
        System.out.println(multiply(input));
        System.out.println(reverse(input));
    }

    public static String productFormatter(String productName, String date) {

        return productName
                .trim()
                .replace(" ", "_")
                .concat(date)
                .toUpperCase();
    }

    public static List multiply (int[] input) {
        List<Integer> newInput = new ArrayList<Integer>();
        int element = 0;
        for(int i = 0; i < input.length; i++) {
            if (i < input.length - 1) {
                 element = input[i] * input[i + 1];
                newInput.add(element);
            } else { element = input[i] * input[0];
                newInput.add(element);
            }
        }
        return newInput;
    }

    public static List reverse (int[] input) {
        List<Integer> newReverse = new ArrayList<Integer>();
        int element = 0;
        for(int i =0; i < input.length; i++) {
            element = input[input.length-i-1];
            newReverse.add(element);
        }
        return newReverse;
    }
}
