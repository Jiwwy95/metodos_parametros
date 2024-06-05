package org.example;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresar la palabra o frase a invertir: ");
        String texto = scanner.nextLine();
        System.out.println("La palabra o frase que ingresada es: " + texto);
        String invertir = invertirCadena(texto);
        System.out.println("Texto ingresado invertido: " + invertir);
        scanner.close();

    }

    public static String invertirCadena(String texto) {
        StringBuilder builder = new StringBuilder(texto);
        return builder.reverse().toString();
    }
}