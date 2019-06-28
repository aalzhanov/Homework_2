package com.test;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Как вас зовут?");
        Scanner yourname = new Scanner(System.in);
        String name = yourname.nextLine();
        System.out.println(name + ", a сколько вам лет?");
        Random random = new Random();
        int age = random.nextInt(108);
        System.out.println("Получается, " + name + ", вам " + age + ". А вы случаем не знаете какая температура сейчас на улице?");
        float t;
        Scanner temperature = new Scanner(System.in);
        t = temperature.nextFloat();
        System.out.println("Ого, не думал, что на улице " + t + " градусов.");
        String nestoit = "Не советую выходить на улицу.";
        String stoit = "На улице отличная погода, почему бы вам не пойти к другу в гости.";

        if(age < 20) {
            if (t < 0 || t > 28) System.out.println(nestoit);
            else System.out.println(stoit);
        } else if(age > 20 && age < 45){
            if (t < -20 || t > 30) System.out.println(nestoit);
            else System.out.println(stoit);
        } else{
            if (t < -10 || t > 25) System.out.println(nestoit);
            else System.out.println(stoit);
        }

    }
}
