/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arrayproject;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class ArrayListExercicio {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> frutas = new ArrayList<>();
        System.out.println("Digite 5 nomes de frutas:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Fruta " + (i + 1) + ": ");
            String fruta = scanner.nextLine();
            frutas.add(fruta);
        }
        System.out.println("Frutas: " + frutas);

        if (frutas.size() > 2) {
            System.out.println("Removendo a terceira fruta: " + frutas.get(2));
            frutas.remove(2);
        }
        System.out.println("Lista atualizada após remoção: " + frutas);

        System.out.print("Digite o nome de uma fruta para buscar: ");
        String frutaParaBuscar = scanner.nextLine();
        boolean encontrado = buscarFruta(frutas, frutaParaBuscar);
        System.out.println("Fruta " + (encontrado ? "encontrada" : "não encontrada") + ": " + frutaParaBuscar);

        ArrayList<Integer> numeros = new ArrayList<>();
        System.out.println("Digite 5 números inteiros:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            int numero = scanner.nextInt();
            numeros.add(numero);
        }
        Collections.sort(numeros);
        System.out.println("Números ordenados: " + numeros);

        int pares = contarPares(numeros);
        System.out.println("Quantidade de números pares: " + pares);

        scanner.close();
    }

    public static boolean buscarFruta(ArrayList<String> frutas, String fruta) {
        return frutas.contains(fruta);
    }

    public static int contarPares(ArrayList<Integer> numeros) {
        int contador = 0;
        for (int num : numeros) {
            if (num % 2 == 0) {
                contador++;
            }
        }
        return contador;
    }
}
