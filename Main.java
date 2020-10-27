package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hola mundo");
        kata_bowling kata= new kata_bowling();
        kata.roll(10);
        kata.roll(11);
        kata.roll(12);
        kata.roll(10);
        kata.roll(11);
        kata.roll(12);
        kata.roll(10);
        kata.roll(11);
        kata.roll(12);

         System.out.println(kata.getScore()
         );

    }
}
