/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ahmed
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        // TODO code application logic here
        Random r=new Random();
        int x;
        int flag=0;
        
        Scanner in =new Scanner(System.in);
        int [] arr=new int [16];
        for (int i = 0; i < 16; i++) {
            arr[i]=16;
            
        }
        for (int i = 0; i < 16; i++) {
            if (arr[i]==16) {
                 x=r.nextInt(16);
                 for (int j = 0; j < 16; j++) {
                     if (arr[j]==x) {
                         flag=1;
                         break;
                         
                     }
                    
                }
                 if (flag==0) {
                    arr[i]=x;
                    arr[arr[i]]=i;
                }
                 else
                 {
                     i--;
                 }
                
            }
        }
        for (int i = 0; i < 16; i++) {
            System.out.print(i+"\t");
        }
        System.out.println("......................");
        for (int i : arr) {
            System.out.print(i+"\t");
        }
    }
    
}
