package com.mycompany.ordenamiento;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;


public class Ordenamiento {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
          Random rand = new Random();

        System.out.print("Ingrese el tamaño de su arreglo?: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        //  datos por aleatoreo 
        
               for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(201) - 100; 
        }

        ordenar(arr);
       System.out.println(java.util.Arrays.toString(arr));
    }

    private static void ordenar(int[] v) {
        for (int i = 0; i < v.length - 1; i++) {
            for (int j = i + 1; j < v.length; j++) {
                if (v[i] > v[j]) {
                    int w = v[j];
                    v[j] = v[i];
                    v[i] = w;
                }
            }
        }
    }
}