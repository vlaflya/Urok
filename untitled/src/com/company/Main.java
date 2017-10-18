package com.company;

public class Main {

    public static void main(String[] args) {
	drob i = new drob(2,4);
	drob i1 = new drob(2,4);
	drob i2 = new drob(3,4);
	System.out.println(i.plus(i1).toString());
	System.out.println(i.plus(i1).toStringSimpled());
	System.out.println(i.min(i1).toString());
	System.out.println(i.plus(i1).toDouble());
	System.out.println(i.min(i1).toDouble());
	System.out.println(i.mult(i1).toString());
	System.out.println(i2.simple().toString());
    }
}
