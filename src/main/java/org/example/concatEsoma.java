package org.example;

public class concatEsoma {
    public static void main(String[] args) {

        System.out.println("2 + 2 = " + 2 + 2); // Resultado 22, pois concatenou ambos digitos numéricos, pois não foi sinalizado como operação
        System.out.println("2 + 2 = " + (2 + 2)); // Resultado 4, pois ao colocar a operação entre parenteses o depurador reconheceu a relação de operação aritmética
    }
}
