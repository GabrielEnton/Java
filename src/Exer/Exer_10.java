/*Sistema de imposto*/

package Exer;

import java.util.Scanner;

public class Exer_10 {
    public static void main(String args[]){
        Scanner ler = new Scanner(System.in);
        
        double salario;
        double imposto = 0;
        double diferenca;

        System.out.println("Digite seu salario: ");
        salario = ler.nextDouble();

        if(salario > 4500){
            imposto = 1000* 0.08 + 1500 * 0.18;
            diferenca = salario - 4500;
            imposto = imposto + diferenca *0.28;
        }
        else if(salario > 3000){
            imposto = 1000 *0.08;
            diferenca = salario - 3000;
            imposto = imposto + diferenca * 0.18;
        }
        else if(salario > 2000){
            diferenca = salario - 2000;
            imposto = diferenca * 0.08;
        }
        
        if(imposto > 0){
            System.out.println("R$ " + imposto);
        }
        else{
            System.out.println("Isento");
        }
    }
}
