package com.tutorial;

public class Main {

    public static void main(String[] args) {

        // Operasi Aritmatika

        int variabel = 11;
        int variabel2 = 5;

        int hasil;

        // 1. Penjumlahan

        hasil = variabel + variabel2;
        System.out.println(variabel + " + " + variabel2 +" = " + hasil);

        // 2. Pengurangan

        hasil= variabel - variabel2;
        System.out.printf("%d - %d = %d \n", variabel,variabel2,hasil);

        // 3. Perkalian

        hasil = variabel * variabel2;
        System.out.println(variabel + " * " + variabel2 +" = " + hasil);

        // 4. Pembagian

        hasil = variabel / variabel2;
        System.out.println(variabel + " / " + variabel2 +" = " + hasil);
            // pembagian float atau koma
            float a = 6;
            float b = 5;

            float hasilFloat = a/b;
            System.out.println(a + " / " + b +" = " + hasilFloat);


        // 5. Modulus (sisa pembagian)

        hasil = variabel % variabel2;
        System.out.println(variabel + " % " + variabel2 +" = " + hasil);
        System.out.printf("%d %% %d = %d \n", variabel,variabel2,hasil); // %% agar tetap menjadi modulus



    }
}
