package com.tutorial;

public class Main {

    public static void main(String[] args) {
	    // Operator assignment

        // assignment operator jumlah
        int a = 1;
        a += 10; // sama aja kaya (a = a+10;)
        System.out.println("nilai a adalah "+a);

        // assignment operator kurang
        int b = 100;
        b -= 25;
        System.out.println("nilai b adalah "+b);

        // assignment operator pembagian
        int c = 100;
        c /= 20;
        System.out.println("nilai c adalah "+c);

        // assignment operator perkalian
        int d = 100;
        d *= 20;
        System.out.println("nilai d adalah "+d);

        // assignment operator modulus
        int e = 10;
        e %= 7;
        System.out.println("nilai e adalah "+e);
    }
}
