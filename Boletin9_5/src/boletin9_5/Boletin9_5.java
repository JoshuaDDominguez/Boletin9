/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_5;

import java.util.Scanner;

/**
 *
 * @author jdominguezdominguez
 */
public class Boletin9_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        Menu obx=new Menu();
        System.out.println("****Menu****\n\na....   2 4 6 8 etc.\nb.... -1 +2 -3 +4 -5 etc.\nc....  0, 1, 1, 2, 3, 5, 8, etc");
        String op=sc.nextLine();
        obx.menu(op);
    }
    
}
