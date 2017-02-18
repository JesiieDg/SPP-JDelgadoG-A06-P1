/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.jdelgadog.a06.p1;
import java.util.Scanner;
/**
 *
 * @author GILDARDO
 */
public class SPPJDelgadoGA06P1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner kb=new Scanner(System.in);
       int numero = 1, suma=0;
       
       do{ 
           System.out.println("Introduzca un número");
           numero=kb.nextInt();
           suma=suma+numero;
           System.out.println("La suma de los dígitos registrados es "+suma);
           
       } while (numero>0);
    }    
    }
    

