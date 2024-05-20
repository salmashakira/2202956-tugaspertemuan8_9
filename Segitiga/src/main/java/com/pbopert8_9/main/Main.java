/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.pbopert8_9.main;

/**
 *
 * @author A S U S
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan sisi segitiga ke 1: ");
        double side1 = input.nextDouble();
        System.out.print("Masukkan sisi segitiga ke 2: ");
        double side2 = input.nextDouble();
        System.out.print("Masukkan sisi segitiga ke 3: ");
        double side3 = input.nextDouble();

        System.out.print("Masukkan warna segitiga: ");
        String color = input.next();

        System.out.print("Apakah segitiga terisi (true/false)? ");
        boolean filled = input.nextBoolean();

        Segitiga segitigaGeometris = new Segitiga(side1, side2, side3);
        segitigaGeometris.setColor(color);
        segitigaGeometris.setFilled(filled);

        System.out.println("\n-----HASIL PERHITUNGAN-----");
        System.out.println("Luas segitiga: " + segitigaGeometris.getArea());
        System.out.println("Keliling segitiga: " + segitigaGeometris.getPerimeter());
        System.out.println("Warna segitiga: " + segitigaGeometris.getColor());
        System.out.println("Segitiga terisi: " + segitigaGeometris.isFilled());
    }
}
        
