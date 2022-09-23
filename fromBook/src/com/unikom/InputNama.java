package com.unikom;

import java.util.Scanner; // Import kelas Scanner

public class InputNama {

    public static void main(String[] args){
        System.out.print("Masukkan Nama anda: ");

        // instansiasi objek scanner
        Scanner scanner = new Scanner(System.in);

        //menyimpan hasil masukkan
        String nama = scanner.next();

        System.out.println("Nama anda adalah: " + nama);
    }
}
