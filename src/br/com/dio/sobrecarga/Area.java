package br.com.dio.sobrecarga;

public class Area {
    public static double quadrilatero(double lado){
        return lado * lado;
    }
    public static double quadrilatero(double lado1, double lado2){
        return lado1 * lado2;
    }
    public static double quadrilatero(double baseMaior, double baseMenor, double altura){
        return ((baseMaior + baseMenor) * altura) / 2;
    }
}
