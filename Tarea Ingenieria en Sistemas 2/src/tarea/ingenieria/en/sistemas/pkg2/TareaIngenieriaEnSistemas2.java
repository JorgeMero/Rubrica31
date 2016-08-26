/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea.ingenieria.en.sistemas.pkg2;

import java.util.Scanner;

/**
 *
 *  Descripciòn: Validar un Nombre de Usuario y una Clave
 *  se le permite tres intentos antes de bloquear el sistema 
 * @author Jorge Mero
 */
public class TareaIngenieriaEnSistemas2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner mientrada=new Scanner(System.in);
        String clave="112346578",usuario="JORGE";
        String miclave="",miusuario="";
        int contador=0, bandera=0;
        do { //todo lo q se repite
            
            //pido un nombre de usuario
            System.out.println("Ingrese su nombre de usuario");
            miusuario=mientrada.nextLine();
            //pido una clave
            System.out.println("Ingrese su clave");
            miclave=mientrada.nextLine();
            //cuento los intento q van
            contador=contador+1;
            //compara si el nombre de usuario y la clave son correcto
            if ((clave.equals(miclave))&& (usuario.equals(miusuario))){
                 bandera=1;
            }
            else {
                //mostrar el mensaje de clave y usuario incorecta 
                //muestro cuanto intento llevo
                System.out.printf("Nombre de usario o clave incorrecta. Van %d de 3 intentos\n",contador);
            }
            if (contador==3)  {//ya llego el nùmero màximo de intento
                bandera=1; //ya no puede repetir
            }
        } while (bandera==0);
        if ((clave.equals(miclave))&& (usuario.equals(miusuario))){
            System.out.println("Bienvenido al sistema");
        }
        else {
            System.out.println("Sistema bloqueado");
        } 
    }
}
        

