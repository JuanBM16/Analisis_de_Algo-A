/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.*;
import java.io.FileNotFoundException;
import java.io.PrintStream;
public class generador {

        static Scanner miscaner = new Scanner (System.in);
        static int cantidad;
        static double precio, total;
       
        public static void main(String[] args)throws FileNotFoundException{
       
                PrintStream DDescritor = new PrintStream("Resultados.txt");
               
                System.out.print("Ahora introduce la cantidad del producto? ");
                cantidad = miscaner.nextInt();
                System.out.print("Ahora introduce el precio del producto? ");
                precio = miscaner.nextDouble();
                System.out.print("Ahora los resultados seran utgenerados en un archivo .txt");
               
                total = cantidad * precio;
               
                DDescritor.println("Cantidad\tPrecio");
                DDescritor.print(cantidad);
                DDescritor.print("\t");
                DDescritor.println(precio);
                DDescritor.println("En total tienes: "+total);
        }

}