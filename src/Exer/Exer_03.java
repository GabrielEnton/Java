/*Calculo cilindro*/

package Exer;

import java.util.Scanner;

public class Exer_03 {
     public static void main(String args[]){
        Scanner ler = new Scanner(System.in);
    
        double altura, raio, volume;
    
        System.out.print("Digite a altura da lata: ");
        altura = ler.nextFloat();
    
        System.out.print("Digite o raio da lata: ");
        raio = ler.nextFloat();
    
        volume= Math.PI*Math.pow(raio,2)*altura;
    
        System.out.print("O valor da lata: " + volume);
    } 
}
