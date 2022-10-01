package br.com.dio.criacao;

import java.util.Scanner;

public class Emprestimo {
    public static void main(String[] args) {
        execute();
    }
    private static void execute() {
        Scanner ent = new Scanner(System.in);
        double emprestimo;
        int parcelas;
        System.out.println("Qual valor do emprestimo?");
        emprestimo = ent.nextDouble();
        System.out.println("Quantas parcelas?");
        parcelas = ent.nextInt();
        ent.close();
        double jurosTotal = jurosTotal(emprestimo, parcelas);
        double valorParcelas = valorParcelas(emprestimo, parcelas);
        System.out.printf("Valor das parcelas: R$%.2f\nValor total: R$%.2f", valorParcelas, jurosTotal);
    }
    private static double valorParcelas(double emprestimo, int parcelas) {
        return (emprestimo / parcelas) + (emprestimo * (0.0053 * parcelas));
    }
    private static double jurosTotal(double emprestimo, int parcelas) {
        return valorParcelas(emprestimo, parcelas) * parcelas;
    }
}
