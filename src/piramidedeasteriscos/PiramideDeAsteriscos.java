/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piramidedeasteriscos;
import java.util.*;


/**TRAPECIO 
 *
 * @author M
 */
public class PiramideDeAsteriscos {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese altura de la piramide");
        int a = sc.nextInt();
        int b=(a*2)-1;
        
        for(int i=0; i<a;i++){
            for(int j=0 ;j<i+a; j++){
            if((i+j)<=a){
            System.out.print(" ");
              }
              else{
            System.out.print("*");
              }
            }
            System.out.println();
}
    }
}

