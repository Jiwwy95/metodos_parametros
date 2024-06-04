package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {

    //Metodo con multiples parametros

    public static void calculate(int a, int b) {
        int sum=a+b;
        int product=a*b;
        System.out.println("La suma es: "+sum);
        System.out.println("El producto es: "+product);
    }

    //Metodo recursivo para calcular el factorial de uin numero

    public static int factorial(int n){
        if (n==0){
            return 1;
        } else {
            return n*factorial(n-1);
        }
    }

    //Generacion de numeros aleatorios

    public static int generateRandomNumber(int min, int max){
        Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }

    //Juego de probabilidad

    public static void playGame(){
        Scanner scanner = new Scanner(System.in);
        int randomNumber = generateRandomNumber(1, 100);
        System.out.println("Adivina el numero entre 1 y 100");
        int guess = scanner.nextInt();
        if (guess == randomNumber){
            System.out.println("Correcto !Adivinaste el numero");
        } else {
            System.out.println("Incorrecto !El numero era: "+ randomNumber);
        }
    }

    public static void main(String[] args) {
        //Uso de metodos con multiples parametros
        calculate(3,7);
        // Uso de metodo recursivo
        int num=5;
        System.out.println("El factorial de "+num+" es: "+factorial(num));

        //Juego de probabilidad
        playGame();
    }
}