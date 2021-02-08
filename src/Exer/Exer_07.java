/*Repetição com do/while*/
package Exer;

import java.util.Scanner;

public class Exer_07 {
    public static void main(String arg[]) {
        Scanner ler = new Scanner(System.in);
        
        int pos, neg;
        float valor, menor;
        String resp;
        
        pos = 0;
        neg = 0;
        menor = 99999;

        do {
            System.out.print("Digite um numero? ");
            valor = ler.nextFloat();

            if (valor < menor) {
                menor = valor;
            }
            if (valor >= 0) {
                pos++;
            } else {
                neg++;
            }

            System.out.print("Deseja digita outro valor (sim/não) ");
            resp = ler.next();

        } while (resp.equalsIgnoreCase("SIM"));

        System.out.print("Dos números digitados temo: " + pos + " positivos e " + neg + " negativos");
        System.out.print("O menor valor é " + menor);
    }
}
