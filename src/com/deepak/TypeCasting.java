package com.deepak;

import java.sql.SQLOutput;
import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        float num = input.nextFloat();
        System.out.println(num);
        ///TypeCasting
        int num1 = (int)(67.57f);
        System.out.println(num1);

    }
}
