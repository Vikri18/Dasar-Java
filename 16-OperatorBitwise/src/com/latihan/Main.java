package com.latihan;

import jdk.swing.interop.SwingInterOpUtils;

public class Main {

    public static void main(String[] args) {
        // Operator Bitwise --> sebuah operator untuk melakukan operasi pada nilai bit

        byte a = 3, b, c;
        String a_bits, b_bits, c_bits;

        // Operator SHIFT LEFT
        System.out.println("---- SHIFT LEFT(<<)");
        a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ','0');
        System.out.printf("%s = %d \n", a_bits, a);
        b = (byte)(a << 3);
        b_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ','0');
        System.out.printf("%s = %d \n", b_bits, b);

        // Operator SHIFT RIGHT (digeser ke kanan)
        System.out.println("---- SHIFT RIGHT(>>)");
        a = 24;
        a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ','0');
        System.out.printf("%s = %d \n", a_bits, a);
        b = (byte)(a >> 2);
        b_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ','0');
        System.out.printf("%s = %d \n", b_bits, b);

        //operator bitwise OR (operator antara nilai bit)
        System.out.println("---- BITWISE(|)");
        a = 24;
        a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ','0');
        System.out.printf("%s = %d \n", a_bits, a);
        b = 12;
        b_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ','0');
        System.out.printf("%s = %d \n", b_bits, b);
        System.out.println("-------------OR");
        c = (byte)(a|b);
        c_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ','0');
        System.out.printf("%s = %d \n", c_bits, c);

        //operator bitwise AND (&)(operator antara nilai bit)

        //operator bitwise XOR (^) (operator antara nilai bit)

        // Operator Negasi / Not (~)
        System.out.println("---- BITWISE NOT(~)");
        a = 24;
        b = (byte)(~a);
        a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ','0');
        System.out.printf("%s = %d \n", a_bits, a);
        b_bits = String.format("%8s",Integer.toBinaryString(a)).substring(24);
        System.out.printf("%s = %d \n", b_bits, b);

    }
}
