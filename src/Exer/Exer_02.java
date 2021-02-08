/*Olá Mundo*/

package Exer;

import java.util.Scanner;

public class Exer_02 {
    public static void main(String args[]){
        Scanner ler = new Scanner(System.in);
    
        String nome;
    
        System.out.print("Digite seu nome: ");
        nome = ler.next();
    
        System.out.print(nome + " diz Olá Mundo para o Java!");
    }
}
