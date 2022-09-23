package com.latihan;

class mahasiswa{
    //atribut
    public String nim;
    public String nama;
    public Double nilai;

    //method
    String tampil_nim(){
        return nim;
    }
    String tampil_nama(){
        return  nama;
    }
    Double hitung_nilai(){
        nilai = 0.5 * nilai;
        return nilai;
    }
}

public class Main {

    public static void main(String[] args) {
	    // membuat objek dari kelas mahasiswa
        mahasiswa mhs = new mahasiswa();

        //mengisi objek mahasiswa
        mhs.nim = "10234234";
        mhs.nama = "Cecilia Cheung";
        mhs.nilai = 70.0;

        //memanggil method tampil mahasiswa
        System.out.println("Nim Mahasiswa \t\t: "+mhs.tampil_nim());
        System.out.println("Nama Mahasiswa \t\t: "+mhs.tampil_nama());
        System.out.println("Nilai Mahasiswa \t: "+mhs.hitung_nilai());

    }
}
