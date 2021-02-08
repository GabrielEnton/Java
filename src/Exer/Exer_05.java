/*Maior ou Menor*/

package Exer;

import java.util.Scanner;

public class Exer_05 {
    public static void main (String ags[]){
        Scanner ler = new Scanner(System.in);
        
        int idade;
        
        System.out.print("Digite a sua idade: ");
        idade = ler.nextInt();
   
        if(idade>=18){
            System.out.print("Você é maior de idade");
            System.out.print("Você tem acesso aos demais canais de tv");
        }
        else{
            System.out.print("Você é menor de idade");
            System.out.print("Você não tem acesso aos demais canais de tv");
        }
    }
}
