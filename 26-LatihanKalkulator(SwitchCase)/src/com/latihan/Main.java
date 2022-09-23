package com.latihan;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println(">>>>Kalkulator Sederhana<<<<");

        //atribut
        Scanner inputUser;
        float a,b, hasil;
        String operator;

        //instance objek
        inputUser = new Scanner(System.in);

        // memasukan nilai
        System.out.print("Nilai a = ");
        a = inputUser.nextFloat();

        System.out.print("Operator [+,-,*,/] = ");
        operator = inputUser.next();

        System.out.print("Nilai b = ");
        b = inputUser.nextFloat();

        // tampil
        System.out.println();
        System.out.println(a + " "+operator+" " + b);

        // perhitungan
        // operator yang tersedia + - * /

        switch (operator){
            case("+"):
                //pertambahan
                hasil = a+b;
                System.out.println("hasil = "+hasil);
                break;
            case("-"):
                //pengurangan
                hasil = a-b;
                System.out.println("hasil = "+hasil);
                break;
            case("*"):
                //perkalian
                hasil = a*b;
                System.out.println("hasil = "+hasil);
                break;
            case("/"):
                //pembagian
                if (b == 0){
                    System.out.println("Hasil tidak bisa ditemukan(tak hingga)");
                } else{
                    hasil = a/b;
                    System.out.println("hasil = "+hasil);
                }
                break;
            default:
                System.out.println("Operator Tidak ditemukan");
        }

//        if (operator=='+'){
//            //pertambahan
//            hasil = a+b;
//            System.out.println("hasil = "+hasil);
//        }else if (operator=='-'){
//            //pengurangan
//            hasil = a-b;
//            System.out.println("hasil = "+hasil);
//        }else if (operator=='*'){
//            //perkalian
//            hasil = a*b;
//            System.out.println("hasil = "+hasil);
//        }else if (operator=='/'){
//            //pembagian
//            if (b == 0){
//                System.out.println("Hasil tidak bisa ditemukan(tak hingga)");
//            } else{
//                hasil = a/b;
//                System.out.println("hasil = "+hasil);
//            }
//        } else {
//            System.out.println("Operator Tidak ditemukan");
//        }

    }
}