package org.example;

public class tresNotas {
    public static void main(String[] args){
     // Crie variáveis para três notas (8, 6 e 10). Mostre a soma e a média.

        double notaUm = 8;
        double notaDois = 6;
        double notaTres = 10;
        double media = notaUm + notaDois + notaTres;

        System.out.println("Tenho três Notas, são elas: " + notaUm + ", " + notaDois + " e " + notaTres +
                ", a soma delas é igual a: " + (notaUm + notaDois + notaTres) +
                ", a Média das notas é igual a: " + (media / 3));

    // Outro exemplo de tres notas

        double notaUma = 10;
        double notaDuas = 8;
        double notaTress = 7.5;
        double media2 = notaUma + notaDuas + notaTress;

        System.out.println("Tenho três Notas, são elas: " + notaUma + ", " + notaDuas + " e " + notaTress +
                ", a soma delas é igual a: " + (notaUma + notaDuas + notaTress) +
                ", a Média das notas é igual a: " + (media2 / 3));
    }
}
