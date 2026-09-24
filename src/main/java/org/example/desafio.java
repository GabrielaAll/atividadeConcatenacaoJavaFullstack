package org.example;

public class desafio {
    public static void main(String[] args){
        /*Desafio: Crie uma variável com 3785 segundos. Mostre quantos minutos inteiros isso dá e quantos segundos sobram.

        Dica: segundos/60 dá os minutos. segundos % 60 mostra os segundos restantes.

        Cheatsheet:
        Printar na tela:
        System.out.println(); (Com aspas pra texto!!)
        Operadores Aritméticos: +, -, *, /, %

         */

        int segundos = 3785;

        System.out.println("Minutos Inteiros: " + (segundos / 60) + ". Segundos Restantes: " + (segundos % 60));
    }
}
