package com.company;

import java.util.Random;

public class Main {


    public static void main(String[] args) {

        System.out.println(ageTemperature(26, 13));
        System.out.println(ageTemperature(40, -8));
        System.out.println(ageTemperature(30, -20));
        System.out.println(ageTemperature(13, 32));
        System.out.println(ageTemperature(24, 20));

        System.out.println(generateRandomAge() + " " + ageTemperature(generateRandomAge(), 10));
    }

    public static String ageTemperature(int age, int temperature) {
        String txt = "Можно идти гулять!";
        String txt2 = "Оставайтесь дома!";
        if (age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30) {
            return txt;
        } else if (age <= 20 && temperature > 0 && temperature <= 28) {
            return txt;
        } else {
            return age >= 45 && temperature >= -10 && temperature <= 25 ? txt : txt2;
        }
    }

    public static int generateRandomAge(){
        Random random = new Random();
        int a = random.nextInt(100);
        return a;
    }

}