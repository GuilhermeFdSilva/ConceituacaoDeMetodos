package br.com.dio.sobrecarga;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        System.out.println("1 - QUADRADO\n2 - RETANGULO\n3 - TRAPESIO");
        int type = ent.nextInt();
        if(type == 1){
            System.out.print("Digite o valor dos lados: ");
            double lado = ent.nextDouble();
            System.out.println("Área = " + Area.quadrilatero(lado));
        }else if(type == 2){
            System.out.print("Digite o valor do lado 1: ");
            double lado1 = ent.nextDouble();
            System.out.print("Digite o valor do lado 2: ");
            double lado2 = ent.nextDouble();
            System.out.println("Área = " + Area.quadrilatero(lado1, lado2));
        }else if(type == 3){
            System.out.print("Digite o valor da base maior: ");
            double baseMaior = ent.nextDouble();
            System.out.print("Digite o valor da base menor: ");
            double baseMenor = ent.nextDouble();
            System.out.print("Digite o valor da altura: ");
            double altura = ent.nextDouble();
            System.out.println("Área = " + Area.quadrilatero(baseMaior, baseMenor, altura));
        }else{
            System.out.println("Valor invalido!!");
        }
        ent.close();
    }
}
