package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Bod bod1 = new Bod(-1, 0);
        System.out.println(bod1.vzdialenost(5, 2));
        Bod bod2 = new Bod();
        bod2.setXY(1, 0);
        System.out.println(bod2.vzdialenost(bod1));
        Bod bod3 = new Bod(0, 2);

        trojuholnik trojuholnik = new trojuholnik(bod1, bod2, bod3);
        System.out.println(trojuholnik.obvod());
        System.out.println(trojuholnik.typ());
        System.out.println(trojuholnik.toString());
    }
}
