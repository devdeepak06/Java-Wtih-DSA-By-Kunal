package com.deepak;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float TempC = input.nextFloat();
        float TempF = (TempC * 9/5) + 32;
        System.out.println(TempF);
    }
}
