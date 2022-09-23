package com.tutorial;

public class Main {

    public static void main(String[] args) {

        // program untuk konversi data

        int nilaiInt = 450; //32 bit
        System.out.println("Nilai INT = " + nilaiInt);

        // memperluas rentang ke tipe data yang lebih besar
        long nilaiLong = nilaiInt;
        System.out.println(nilaiLong);

        // memperkecil rentang ke tipe data yang lebih kecil
        byte nilaiByte = (byte) nilaiInt;//dengan tambahkan tipe data di depan nilai yang ingin kita casting. namanya casting operator
        System.out.println(nilaiByte);

        // casting pembagian
        int a = 10;
        int b = 4;

        float c = a/b; //ini hasilnya akan salah, walaupun sudah koma
        System.out.printf("%d / %d = %f\n",a,b,c);
            //cara yang benar adalah dengan mengganti tipe data dari salah satu variable operand
            float e = 10;
            int f = 4;

            float g = e/f;
            System.out.printf("%f / %d = %f\n",e,f,g);

            //atau jika tidak mau dirubah salah satu variabel operandnya lakukan seperti ini
            int x = 10;
            int y = 4;

            float z = (float) x/y; //ini hasilnya akan salah, walaupun sudah koma
            System.out.printf("%d / %d = %f\n",x,y,z);


    }
}
