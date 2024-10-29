/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class VetorExercicio {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int soma = 0;
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        System.out.println("Insira 10 valores inteiros:");
        for (int i = 0; i < 10; i++) {
            numeros[i] = scanner.nextInt();
            soma += numeros[i];
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        System.out.println("Soma: " + soma);
        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);
        System.out.println("Valores inseridos:");
        for (int num : numeros) {
            System.out.println(num + (num == maior ? " (Maior)" : "") + (num == menor ? " (Menor)" : ""));
        }
        
        scanner.close();
    }
}
