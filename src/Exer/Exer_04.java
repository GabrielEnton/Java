/*Escolha do operador aritmético*/
package Exer;

import java.util.Scanner;

public class Exer_04 {
    public static void main(String args[]){
        Scanner ler = new Scanner(System.in);
        float a, b;
        String op;
        
        System.out.print("Digite o valor de A: ");
        a = ler.nextFloat();
        
        System.out.print("Digite o valor de B: ");
        b = ler.nextFloat();
        
        System.out.print("Digite o operador aritmético: ");
        op = ler.next();
        
        calcular(a,b,op);
    }

    public static void calcular(float a, float b, String op) {
        float resp;
        
        if(op.equals("+")){
            resp=a+b;
            System.out.print("O resultado da sua operação aritmética é de " + resp );
        }
        else if(op.equals("-")){
            resp=a-b;
            System.out.print("O resultado da sua operação aritmética é de " + resp );
        }
        else if(op.equals("*")){
            resp=a*b;
            System.out.print("O resultado da sua operação aritmética é de " + resp );
        }
        else if(op.equals("/")){
            resp=a/b;
            System.out.print("O resultado da sua operação aritmética é de " + resp );
        }
        else{
            
        }
    }
}
