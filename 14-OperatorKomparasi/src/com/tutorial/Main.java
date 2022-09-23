package com.tutorial;

public class Main {

    public static void main(String[] args) {
        // operator komparasi... ini akan menghasilkan nilai dalam bentuk boolean
//        int a,b;
//        a = 10;
//        b = 10;
//        System.out.printf("Apakah nilai %d dengan %d sama ? %s \n ",a,b,(a==b));

        //bisa juga seperti ini

        //operator equal atau persamaan
        System.out.println("=====PERSAMAAN");
        int a,b;
        a = 10;
        b = 10;
        boolean hasilKomparasi = (a==b);
        System.out.printf(" %d == %d ---> %s \n",a,b,hasilKomparasi);

        //operator NOT equal atau pertidaksamaan
        System.out.println("=====PERTIDAKSAMAAN");
        //int a,b;
        a = 10;
        b = 10;
        hasilKomparasi = (a!=b);
        System.out.printf(" %d != %d ---> %s \n \n",a,b,hasilKomparasi);

        //operator less than atau kurang dari
        System.out.println("=====KURANG DARI");
        //int a,b;
        a = 10;
        b = 10;
        hasilKomparasi = (a < b);
        System.out.printf(" %d < %d ---> %s \n ",a,b,hasilKomparasi);

        //operator greater than atau lebih dari
        System.out.println("=====LEBIH DARI");
        //int a,b;
        a = 10;
        b = 10;
        hasilKomparasi = (a > b);
        System.out.printf(" %d > %d ---> %s \n \n",a,b,hasilKomparasi);

        //operator less than equal atau kurang dari sama dengan
        System.out.println("=====KURANG DARI SAMA DENGAN");
        //int a,b;
        a = 10;
        b = 10;
        hasilKomparasi = (a <= b);
        System.out.printf(" %d <= %d ---> %s \n ",a,b,hasilKomparasi);

        //operator greater than atau lebih dari
        System.out.println("=====LEBIH DARI SAMA DENGAN");
        //int a,b;
        a = 10;
        b = 10;
        hasilKomparasi = (a >= b);
        System.out.printf(" %d >= %d ---> %s \n \n ",a,b,hasilKomparasi);




    }
}
