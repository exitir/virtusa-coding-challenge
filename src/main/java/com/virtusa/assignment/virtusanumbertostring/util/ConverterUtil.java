package com.virtusa.assignment.virtusanumbertostring.util;

import java.util.HashMap;

/**
 * Created by Irfan on 17-Jul-19.
 */
public class ConverterUtil {
    private HashMap h;
    private static ConverterUtil instance;

    //Singleton
    private ConverterUtil() {
        h = new HashMap<Integer, String>();
        initializeMap();
    }

    public static ConverterUtil getInstance() {
        if (instance == null) {
            instance = new ConverterUtil();
        }
        return instance;
    }

    public String convertToWord(int number) {

        if (number == 0)
            return "";

        String str = Integer.toString(number);
        int len = str.length();
        StringBuffer finalString = new StringBuffer();

        if (h.containsKey(number)) {
            return (String) h.get(number);
        } else if (len < 3) {
            int temp = number - number % 10;
            finalString.append((String) h.get(temp)).append(" ").append((String) h.get(number % 10));

        } else if (len < 4) {
            int temp = number / 100;
            finalString.append(convertToWord(temp)).append(" ").append((String) h.get(100)).append(" and ")
                    .append(convertToWord(number % 100));

        } else if (len < 7) {
            int temp = number / 1000;
            finalString.append(convertToWord(temp)).append(" ").append((String) h.get(1000)).append(" ")
                    .append(convertToWord(number % 1000));
        } else if (len >= 7 && len <= 9) {
            int temp = number / 1000000;
            finalString.append(convertToWord(temp)).append(" ").append((String) h.get(1000000)).append(" ")
                    .append(convertToWord(number % 1000000));
        }

        return finalString.toString();
    }

    private void initializeMap() {
        h.put(0, "zero");
        h.put(1, "one");
        h.put(2, "two");
        h.put(3, "three");
        h.put(4, "four");
        h.put(5, "five");
        h.put(6, "six");
        h.put(7, "seven");
        h.put(8, "eight");
        h.put(9, "nine");
        h.put(10, "ten");
        h.put(11, "eleven");
        h.put(12, "twelve");
        h.put(13, "thirteen");
        h.put(14, "forteen");
        h.put(15, "fifteen");
        h.put(16, "sixteen");
        h.put(17, "seventeen");
        h.put(18, "eighteen");
        h.put(19, "ninteen");
        h.put(20, "twenty");
        h.put(30, "thirty");
        h.put(40, "forty");
        h.put(50, "fifty");
        h.put(60, "sixty");
        h.put(70, "seventy");
        h.put(80, "eighty");
        h.put(90, "ninty");
        h.put(100, "hundred");
        h.put(1000, "thousand");
        h.put(1000000, "million");
    }
}
