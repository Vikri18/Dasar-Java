package com.tutorial;

public class Main {

    public static void main(String[] args) {
	    //Operator logika --> operasi yang bisa kita lakukan kepada tipe data boolean
        // AND, OR, Xor. Negasi

        boolean a,b,c;
        // OR atau (||)
        System.out.println("-----OR(||)");
        a = true;
        b = false;
        c = (a || b);
        System.out.println(a +"||"+b+" = "+c);

        // AND / DAN (&&)
        System.out.println("-----AND(&&)");
        a = true;
        b = false;
        c = (a && b);
        System.out.println(a +"&&"+b+" = "+c);

        // XOR / exclusive or (^)
        System.out.println("-----XOR(^)");
        a = true;
        b = false;
        c = (a ^ b);
        System.out.println(a +"^"+b+" = "+c);

        // NOT / Negasi  (!)
        System.out.println("-----NEGASI(!)");
        a = true;
        //b = false;
        c = !a;
        System.out.println(a +"--> (!) = "+c);




    }
}
