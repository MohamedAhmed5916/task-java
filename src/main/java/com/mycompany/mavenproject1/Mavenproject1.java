/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

import java.util.Scanner;

/**
 *
 * @author Home™
 */
public class Mavenproject1 {

    public static void main(String[] args) {
Scanner in =new Scanner(System.in);
         System.out.println("enter number of numbers :");
         int n=in.nextInt();
         double max=0;
         double min=0;

         for (int i = 1; i <= n; i++) {
           System.out.println("enter the numbers: ");
          
           int x=in.nextInt();
            
            if(max==0 && min==0){
                max=min=x;
            }
             if (x>max){
               
               max=x;
               
             }else if(x<min){
                 min=x;
             }
         
         }
       double diff=max-min;
       if ( diff==0 ){
           System.out.println("special case ");
       }
         else if(diff>0.5*max){
           System.out.println("dangerous zone");
       }else if(diff<0.5*max){
           System.out.println("safe zone");
           
       }    
    }
}
