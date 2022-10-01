package br.com.dio.criacao;

import java.util.Scanner;

public class OperacoesBasicas {
    public static void main(String[] args) {
        execute();
    }
    private static void execute() {
        Scanner ent = new Scanner(System.in);
        int a, b;
        System.out.print("Digite o primeiro valor: ");
        a = ent.nextInt();
        System.out.print("Digite o segundo valor: ");
        b = ent.nextInt();
        ent.close();
        System.out.println(soma(a, b));
        System.out.println(sub(a, b));
        System.out.println(mult(a, b));
        System.out.println(div(a, b));
        System.out.println(mod(a, b));
    }
    private static int soma(int a, int b) {
        return a + b;
    }
    private static int sub(int a, int b) {
        return a - b;
    }
    private static int mult(int a, int b) {
        return a * b;
    }
    private static double div(int a, int b) {
        return (double)a / b;
    }
    private static int mod(int a, int b) {
        return a % b;
    }
}