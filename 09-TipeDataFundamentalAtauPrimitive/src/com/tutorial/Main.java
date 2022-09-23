package com.tutorial;

public class Main {

    public static void main(String[] args) {
        // integer, byte, short, long, double, float, char, boolean

        // integer(satuan)
        int i = 10;
        System.out.println("=====INTEGER=====");
        System.out.println("integer i = "+i);
        System.out.println("Nilai Maks = "+ Integer.MAX_VALUE);
        System.out.println("Nilai Min = "+ Integer.MIN_VALUE);
        System.out.println("Besar integer = "+ Integer.BYTES + " bytes");
        System.out.println("Besar integer = "+ Integer.SIZE + " bit");

        // byte(satuan)
        byte b = 10;
        System.out.println("=====BYTE=====");
        System.out.println("Byte b = "+ b);
        System.out.println("Nilai Maks = "+ Byte.MAX_VALUE);
        System.out.println("Nilai Min = "+ Byte.MIN_VALUE);
        System.out.println("Besar Byte = "+ Byte.BYTES + " bytes");
        System.out.println("Besar Byte = "+ Byte.SIZE + " bit");

        // short (satuan)
        short s = 10;
        System.out.println("=====SHORT=====");
        System.out.println("short s = " + s);
        System.out.println("Nilai Maks = "+ Short.MAX_VALUE);
        System.out.println("Nilai Min = "+ Short.MIN_VALUE);
        System.out.println("Besar Short = "+ Short.BYTES + " bytes");
        System.out.println("Besar Short = "+ Short.SIZE + " bit");

        // long (satuan)
        long l = 10L;
        System.out.println("=====LONG=====");
        System.out.println("Long l = " + l);
        System.out.println("Nilai Maks = "+ Long.MAX_VALUE);
        System.out.println("Nilai Min = "+ Long.MIN_VALUE);
        System.out.println("Besar long = "+ Long.BYTES + " bytes");
        System.out.println("Besar long = "+ Long.SIZE + " bit");

        // double (koma, bilangan real)
        double d = 10.5d;
        System.out.println("=====DOUBLE=====");
        System.out.println("double d = " + d);
        System.out.println("Nilai Maks = "+ Double.MAX_VALUE);
        System.out.println("Nilai Min = "+ Double.MIN_VALUE);
        System.out.println("Besar double = "+ Double.BYTES + " bytes");
        System.out.println("Besar double = "+ Double.SIZE + " bit");

        // float (koma, bilangan real)
        float f = 10.5f;
        System.out.println("=====FLOAT=====");
        System.out.println("float f = " + f);
        System.out.println("Nilai Maks = "+ Float.MAX_VALUE);
        System.out.println("Nilai Min = "+ Float.MIN_VALUE);
        System.out.println("Besar float = "+ Float.BYTES + " bytes");
        System.out.println("Besar float = "+ Float.SIZE + " bit");

        // char (koma, bilangan real)
        char c = 'c';
        System.out.println("=====CHARACTER=====");
        System.out.println("char c = " + c);
        System.out.println("Nilai Maks = "+ Character.MAX_VALUE);
        System.out.println("Nilai Min = "+ Character.MIN_VALUE);
        System.out.println("Besar char = "+ Character.BYTES + " bytes");
        System.out.println("Besar char = "+ Character.SIZE + " bit");

        // char (TRUE atau FALSE)
        boolean val = false;
        System.out.println("=====BOOLEAN=====");
        System.out.println("boolean val = " + val );
        System.out.println("Nilai Maks = "+ Boolean.TRUE);
        System.out.println("Nilai Min = "+ Boolean.FALSE);


    }
}
