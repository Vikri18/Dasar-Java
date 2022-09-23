package com.latihan;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // Switch Case

        // bentuk umum
        /*
        switch(ekspresi){
            case pilihan:
                statement
        }*/

        String input;
        Scanner inputUser = new Scanner(System.in);

        System.out.println("Pilih Menu : ");
        input = inputUser.next();

        //ekspresinya bisa berupa satuan (int, long, byte, short), String atau enum
        switch (input){
            case "1":
                System.out.println("tampilan menu 1");
                break;//agar keluar dari looping, jika tidak pakai break maka misal 1 saja true maka semua statement akan di eksekusi
            case "2":
                System.out.println("Tampilan menu 2");
                break;
            default:
                System.out.println("keluar");
        }
        System.out.println("Program selesai");
    }
}
