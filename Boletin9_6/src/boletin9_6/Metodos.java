/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_6;
import java.util.Scanner;
/**
 *
 * @author jdominguezdominguez
 */
public class Metodos {
    Scanner sc=new Scanner(System.in);
    static int soldo=0;
    float menor=0;
    int mayor=0,i=0;
    
    public void obtenerSoldo(){
    do{
        if(soldo<0){
            System.out.println("Error! Introduzca un soldo positivo\n\n");
        }
        System.out.println("Introduzca un sueldo");
        soldo=sc.nextInt();
    }while(soldo<0);
    }
    
    public void clasificarSoldo(){
        do{
        Metodos.this.obtenerSoldo();
        if(soldo>1000 && soldo<1750){
            mayor++;
            i++;
        }
        else if(soldo<1000){
            menor++;
            i++;        
        }
        }while(soldo!=0);
        System.out.println(mayor+" cobran entre 1000€ y 1750€. El "+i/100*menor+"% cobran menos de 1000€");
    }
}

