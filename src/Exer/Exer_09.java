/*Média de salario anual*/

package Exer;

import java.util.Scanner;

public class Exer_09 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        
        float salario[][], soma;
        String nome[];
        int i,j, quant;
        salario = new float [800][12];
        nome = new String[800];
        
        System.out.print("Digite o número de funcionários: ");
       quant = ler.nextInt();
        
        
        for(i=0; i<quant; i++){
            System.out.print("Digite o nome do funcionário " + (i+1) + "º" + ": ");
            nome[i] = ler.next();
            
            for(j=0; j<12; j++){
                System.out.print("Digite seu salário do mês " + (j+1) + "º" + ": ");
                salario[i][j] = ler.nextFloat();
            }
        }

        for(j=0; j<12; j++){
            soma=0;
            
            for(i=0; i<quant; i++){
                soma += salario[i][j];
            }
            
            System.out.print("\nA média dos salários pagos pela empresa no mês " + (j+1) + " foi de R$ " + (soma/quant));
        }

        for(i=0; i<quant; i++){
            soma=0;
            
            for(j=0; j<12; j++){
                soma += salario[i][j];
            }
            
            System.out.print("\n"+ nome[i] + " a média anual de seus salários é: R$ " + (soma/12));
        }
    }
}
