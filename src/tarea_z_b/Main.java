/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea_z_b;

/**
 *
 * @author 
 */


import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        for (int j = 1; j <= 100; j++) {
            System.out.println("Caso:" + j);

            Random random = new Random();
            int n = random.nextInt(20000);
            while (!esParElNumero(n) && n >= 2) {
                n = random.nextInt(20000);
            }
            int arr[] = new int[n];
            int cont = 0;

            for (int i = 0; i < arr.length / 2; i++) {
                arr[i] = generarNumeroAleatorioPar();
                cont++;
            }
            for (int i = cont; i < arr.length; i++) {
                arr[i] = generarNumeroAleatorioImpar();
            }
           generaArchivo(arr,System.getProperty("user.dir")+"\\prueba.csv");

        }

    }


    static public int generarNumeroAleatorioPar() {
        Random random = new Random();
        int number = random.nextInt(1000);
        while (!esParElNumero(number)) {
            number = random.nextInt(1000);
        }
        return number;
    }

    static public boolean esParElNumero(int number) {
        return (number % 2) == 0;
    }


    static public int generarNumeroAleatorioImpar() {
        Random random = new Random();
        int number = random.nextInt(1000);
        while (!esImparElNumero(number)) {
            number = random.nextInt(1000);
        }
        return number;
    }

    static public boolean esImparElNumero(int number) {
        return (number % 2) != 0;
    }

    static public void generaArchivo(int arr[], String rutaFinal) throws IOException {
        if (arr.length > 0) {
            //Creacion de archivo Csv.
            try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(rutaFinal), StandardCharsets.ISO_8859_1))) {
                for (int i = 0; i < arr.length; i++) {
                    writer.newLine();
                    writer.write(String.valueOf(arr[i]));
                }
                System.out.println("Archivo generado con exito");
            }
        } else {
            System.out.println("Error al generar archivo por falta de datos");
        }
    }

}