package com.latihan;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Ternary Operator

        int input,x;
        Scanner inputUser = new Scanner(System.in);

        System.out.print("Masukkan nilai : ");
        input = inputUser.nextInt();

            // bentuk umum
            // variabel x = ekspresi ? statement_true : statement_false
        x = (input==10) ? (input*input) : (input/2);

            // jika memakai if
        /*
            if(input==10){
                x = input*input;
            }else{
                x = input/2;
            }
        */
        System.out.println(x);


    }
}
