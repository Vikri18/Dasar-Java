package com.unikom;

public class Permen {
    public void tambahPermen() {
        //deklarasi variabel lokal
        int jumlahPermen = 0;

        jumlahPermen = jumlahPermen + 1;
        System.out.println("jumlah permen setelah ditambah " + jumlahPermen);
    }

    public static void main(String[] args) {
        Permen permenSusu = new Permen();
        permenSusu.tambahPermen();
    }
}
