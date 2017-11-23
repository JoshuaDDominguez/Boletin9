/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_5;


/**
 *
 * @author jdominguezdominguez
 */
public class Menu {
    Metodos obx=new Metodos();
    
    public void menu(String op){     
        
        switch(op){
            case "a":
                 obx.serieA();
                 break;
                 
            case "b":
                obx.serieB();
                break;
                
            case "c":
                obx.serieC();
                break;
                
            default:
                System.out.println("Error!");
                break;
         }
    }
}
