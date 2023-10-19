package com.exo4;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
    
    
            Scanner clavier = new Scanner (System.in);
            int salaireAnMin = 30000;
            int tempsAnMin = 2;
            
            System.out.println("Entrez le salaire par an et depuis combien de temps tu travail ");
            int salaireAn = clavier.nextInt();
            int tempsAn = clavier.nextInt();

            if (salaireAn >= salaireAnMin && tempsAn >= tempsAnMin){
            System.out.println("Le prêt est accordé"); 
            }  
            else {
                System.out.println("Le prêt n'est pas accordé");
            }
           
    }
}


