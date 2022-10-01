package br.com.dio.criacao;

import java.util.Date;

public class Saudacao {
    public static void main(String[] args) {
        execute();
    }
    private static void execute() {
        String saudacao;
        Date time =  new Date();
        long hours = time.getTime();
        saudacao = getSaudacao(hours);
        System.out.println(saudacao);
    }
    private static String getSaudacao(long hours) {
        int time = (int)(hours / 100000000000L);
        if(time < 12){
            return "Bom Dia!!";
        }
        if(time < 18){
            return "Boa Tarde!!";
        }
        return "Boa Noite!!";
    }
}
