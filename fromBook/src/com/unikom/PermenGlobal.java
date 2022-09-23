package com.unikom;

public class PermenGlobal {
    //variabel jumlahPermen menjadi variabel instance
    //inisialisasi variabel jumlahPermen = 10
    int jumlahPermen = 10;

    //method untuk menampilkan jumlah permen
    public void getJumlahPermen(){

        System.out.println("jumlah permen: " + jumlahPermen);
    }
    public void tambahPermen(){
        jumlahPermen = jumlahPermen + 1;
        System.out.println("jumlah permen setelah ditambah: " + jumlahPermen);
    }

    public static void main(String[] args) {
        PermenGlobal permenSusu = new PermenGlobal();

        //menampilkan jumlah permen yang ada saat program pertama x berjalan
        permenSusu.getJumlahPermen();

        //Menambah satu permen
        permenSusu.tambahPermen();

        //Menampilkan jumlah permen yang ada
        permenSusu.getJumlahPermen();

    }
}
