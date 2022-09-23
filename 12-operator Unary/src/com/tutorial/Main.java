package com.tutorial;

public class Main {

    public static void main(String[] args) {
	    // unary = operasi yang dilakukan pada satu variabel

        // unary + dan -

        int angka = 1;
        System.out.printf("uanry '+', %d menjadi %d\n",angka, +angka);
        System.out.printf("uanry '-', %d menjadi %d\n",angka, -angka);

        //unary decrement and increment
            //menambahkan nilai, dikurang 1 atau ditambah 1
        int angka2 = 10;
        angka2++;//increamnet
        System.out.println("nilai dengan '++' menjadi = "+ angka2);

        int angka3 = 10;
        angka3--; // decrement
        System.out.println("nilai dengan '--' menjadi = "+ angka3);

        int a = 5;
        System.out.printf("nilai dengan '++' prefix menjadi = %d \n", ++a);// ini akan dikerjakan terlebih dahulu (++a), baru kemudian di tampilkan
        int b = 5;
        System.out.printf("nilai dengan '++' postfix menjadi = %d \n", b++);// ini akan di kerjakan belakangan
        System.out.printf("nilai dengan '++' postfix menjadi = %d \n", b); // ketika di tampilkan lagi baru terlihat perbedaannya

        // unary boolean dengan !(bang) untuk negasi
        boolean coba = true;
        System.out.println("nilai boolean = "+ coba);
        System.out.println("nilai boolean = "+ !coba);
    }
}
