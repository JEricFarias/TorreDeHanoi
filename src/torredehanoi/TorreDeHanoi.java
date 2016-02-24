/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package torredehanoi;

/**
 *
 * @author Eric Farias
 */

import java.util.Scanner;

public class TorreDeHanoi {
   
    /**
     * @param discos número de discos da torre;
     * @param torre1 torre A torre de Origem;
     * @param torre2 torre B torre de Trabalho ou torre auxiliar;
     * @param torre3 torre C torre de Destino;
     */
    public void hanoi(int discos, int torre1, int torre2, int torre3){
        if(discos == 1){
            System.out.println("Mover disco da Torre " + torre1 + " a Torre " + torre3);
        } else{
            hanoi(discos - 1, torre1, torre3, torre2);
            System.out.println("Mover disco da Torre " + torre1 + " a Torre " + torre3);
            hanoi(discos - 1, torre2, torre1, torre3);
        }
    }
    
    // teste
    public static void main(String []args){
        TorreDeHanoi han = new TorreDeHanoi();
        han.hanoi(4,1,2,3);
    }
}
