package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a,b;
        System.out.println("Digite o primeiro valor ");
        a = scan.nextInt();
        System.out.println("Digite o segundo valor ");
        b = scan.nextInt();

        int somar = somar(a, b);
        int subtrair = subtrair(a, b);
        float dividir = dividir(a, b);
        int multiplica = multiplica(a, b);

        System.out.println("A soma é :" + somar);
        if(a >0 & b>0) {
            System.out.println("A divisão é :" + dividir);
        }
        System.out.println("A multiplicação é :" + multiplica);
        System.out.println("A subtração é :" + subtrair);

    }

    public static int somar(int a,int b){
        return a+b;
    }
    public static int subtrair(int a,int b){
        return a-b;
    }

    public  static float dividir(float a, float b){
        return a/b;
    }

    public static int multiplica(int a, int b){
        return a*b;
    }
}
