package com.virtusa.assignment.virtusanumbertostring.converter;

import com.virtusa.assignment.virtusanumbertostring.constants.Constants;
import com.virtusa.assignment.virtusanumbertostring.exceptions.NumberNotYetSupported;
import com.virtusa.assignment.virtusanumbertostring.util.ConverterUtil;

import java.io.InputStreamReader;
import java.util.Scanner;

public class NumberToStringConverter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(new InputStreamReader(System.in));
        int choice = 0;

        try {
            do {
                System.out.println(Constants.INPUT_MESSAGE1);
                System.out.println(Constants.INPUT_MESSAGE2);
                try {
                    int num = sc.nextInt();
                    if (num <= 0 || Integer.toString(num).length() > 9) {
                        throw new NumberNotYetSupported();
                    }

                    System.out.println(Constants.OUTPUT_MESSAGE1 + num);
                    System.out.println(Constants.OUTPUT_STRING + ConverterUtil.getInstance().convertToWord(num));
                } catch (Exception e) {
                    System.out.println(Constants.INVALID_INPUT_MESSAGE);
                    sc.nextLine();
                }

                do {
                    try {
                        System.out.println("");
                        System.out.println(Constants.CONTINUE_MESSAGE);
                        choice = sc.nextInt();
                        if (choice != 0 && choice != 1) {
                            System.out.println(Constants.INVALID_INPUT_MESSAGE);
                            sc.nextLine();
                        }
                    } catch (Exception e) {
                        System.out.println(Constants.INVALID_INPUT_MESSAGE);
                        sc.nextLine();
                        choice = -1;
                    }
                } while (choice != 0 && choice != 1);
            } while (choice == 0);

        } catch (Exception e) {
            System.out.println(Constants.INVALID_INPUT_MESSAGE2);
        }
        System.out.println(Constants.EXIT_APPLICATION_MESSAGE);
    }
}
