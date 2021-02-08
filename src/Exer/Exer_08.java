/*Repetição com for*/

package Exer;

import java.util.Scanner;

public class Exer_08 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
      
        int[] media = {0,0,0,0,0};
        int x,num, c=0;  

        for(x=1;x<=4;x++){
            System.out.print("Insira a média do " + x + "º aluno: ");
            num = scanner.nextInt();
            
            media[x] = num;
        }
      
        for(x=1;x<=4;x++){
            if(media[x]>=7)
                c++;
        }
        
        System.out.print("O número de alunos com média maior ou igual à 7 é igual a " + c);
    }
}
