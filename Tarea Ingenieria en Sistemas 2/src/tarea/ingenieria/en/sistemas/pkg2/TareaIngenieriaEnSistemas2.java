/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea.ingenieria.en.sistemas.pkg2;

import java.util.Scanner;

/**
 *
 * Descripción: Mostrar un menù con 3 operaciones Matemàticas; Suma, Resta y Mùltiplicaciòn al Usuario 
 *  y que le permita al usuario escojer la opcion que desee tendras la opcion de seguir o no 
 * @author Jorge Mero
 */
public class TareaIngenieriaEnSistemas2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner mientrada=new Scanner(System.in); 
        String clave="1311228910",usuario="JORGE";
        String miclave="",miusuario="";
        int contador=0,bandera=0;
        String sigue="", resp="S";
        int suma=0, resta=0, producto=0;
        double valor1=0, valor2=0, division=0.0;
        int opcion=0;
        do {//todo lo que se repite
            //pido un nombre de usuario
            System.out.println("Ingrese su usuario");
            miusuario=mientrada.nextLine();
            //pido una clave
            System.out.println("Ingrese su clave");
            miclave=mientrada.nextLine();
            //cuento los intentos cuantos van
            contador=contador+1;
            //comparo si el nombre de usuario y la clave son correctas
            if ((clave.equals(miclave))&&(usuario.equals(miusuario))) {
                bandera=1;//si esta correcta le digo ya no repita
            }
            else {
                //voy a mostrar el mensaje de clave y usuario incorrectos 
                //muestro cuantos intentos llevca
                System.out.println("1 de 3 intentos");
            }
            if(contador==3) {//ya llego al número máximo de intentos
                bandera=1;//ya no puede repetir
            }
        } while (bandera==0);
        if ((clave.equals(miclave))&&(usuario.equals(miusuario))) {
            do {
                System.out.println("♦♦CALCULADORA BASICA♦♦");
                System.out.println("♦♦ 1.- SUMAR ♦♦");
                System.out.println("♦♦ 2.- RESTAR ♦♦");
                System.out.println("♦♦ 3.- MULTIPLICAR ♦♦");
                System.out.println("Elija 1 de las 3 opciones");
                opcion=mientrada.nextInt();
                System.out.println("Ingrese primer valor ==> ");
                valor1=mientrada.nextInt();
                System.out.println("Ingrese segundo valor ==> ");
                valor2=mientrada.nextInt();
                if (opcion==1){
                  suma=(int)(valor1+valor2);
                  System.out.printf("La suma de %d mas %d es igual a %d ",valor1, valor2, suma);
                  System.out.println("");
                  System.out.println("Desea continuar S/N");
                  sigue=mientrada.nextLine();
                }
                if (opcion==2){
                  resta=(int)(valor1-valor2);
                  System.out.printf("La resta de %d menos %d es igual a %d ",valor1, valor2, resta);
                  System.out.println("");
                  System.out.println("Desea continuar S/N");
                  sigue=mientrada.nextLine();
                }
                if (opcion==3){
                  producto=(int)(valor1*valor2);
                  System.out.printf("La multiplicación de %d por %d es igual a %d ",valor1, valor2, producto);
                  System.out.println("");
                  System.out.println("Desea continuar S/N");
                  sigue=mientrada.nextLine();
                }
                sigue=mientrada.nextLine();
            }while(resp.equals(sigue));
        }
        else {
            System.out.println("Sistema bloqueado");
        }
    }
    
} 
