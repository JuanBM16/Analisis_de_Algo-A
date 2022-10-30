/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea_z_b;

import java.util.Scanner;

/**
 *
 * @author Ryzen
 */
public class Ejecucion {
    
        static Scanner sc = new Scanner(System.in);

    
    public static void main(String[] args) {
        
        System.out.println("Ingrese cantidad de datos");
        int n = sc.nextInt();
        int caso[] = new int[n];
        System.out.println("Ingrese los datos");
        for (int i = 0; i < caso.length; i++) {
            caso[i] = sc.nextInt();
        }
       
        sortArrayByParityII(caso);
        
    }
 
    
    public static int[] sortArrayByParityII(int[] nums) {
        int indicePar= 0;
        int indiceImpar = 1;
        int n = nums.length;
        while (indicePar < n && indiceImpar < n) {
            while (indicePar < n && nums[indicePar] % 2 == 0) {
                indicePar += 2;
            }
            while (indiceImpar < n && nums[indiceImpar] % 2 == 1) {
                indiceImpar += 2;
            }
            if (indiceImpar < n && indicePar < n) {
                swap(nums, indicePar, indiceImpar);
            }
        }
        return nums;
    }
    
    private static void swap(int[] nums, int i, int j) {
        if(i!=j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }  
    }
}
