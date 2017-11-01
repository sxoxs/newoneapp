package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;


public class Main {

    public static void main(String[] args) throws IOException {

       /* for (;;) {

            String mystr = "first line";
            System.out.println("Это исходная строка: " + mystr);
            System.out.print("Введите номер символа: ");


            int indexline = Integer.parseInt(InputConsol());
            System.out.print("Это выбранный символ: ");
            System.out.println(mystr.charAt(indexline - 1));

            System.out.println("Для выхода нажмите q");

            if ("q" == InputConsol() ) {
                break;
            }

        }*/



       int[] intarray = new int[30];
        Random rand = new Random();
       for (int i = 0; i < intarray.length;){
            intarray[i++] = rand.nextInt(30) + 1;
       }

       for (int i : intarray){
           System.out.print(i + ", ");
       }
        System.out.println();
        System.out.println(Arrays.toString(intarray));
    }

    static String InputConsol() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        return  br.readLine();
    }
}
