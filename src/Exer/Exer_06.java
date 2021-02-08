/*Calcular a médio*/

package Exer;

import java.util.Scanner;

public class Exer_06 {
    public static void main(String arg[]) {
        Scanner ler = new Scanner(System.in);
        
        int quantidade, i;
        float valor, media, acum = 0;
        
        System.out.print("Quantos valores desja processar? ");
        quantidade = ler.nextInt();
        
        for (i = 1; i <= quantidade; i++) {
            System.out.print("Digite um valor: ");
            valor = ler.nextFloat();
            
            acum =+ valor;
        }
        
        media = acum / quantidade;
        
        System.out.print("A media dos valores processados é de" + media);
    }   
}
