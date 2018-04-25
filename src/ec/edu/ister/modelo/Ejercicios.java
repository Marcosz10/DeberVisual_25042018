/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.modelo;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author ariel
 */
public class Ejercicios {

    /*Ejercicio 1: Desarrollar solución que permita ingresar la temperatura en 
    celsius.Mostrar su equivalente en grados Farenheit y en kelvin.Considere:
    f=(9/5)*C+32
    k=c+273
     */
    public void conversion() {
        Scanner sc = new Scanner(System.in);
        JOptionPane.showInputDialog("Seleccione una conversion:\n1. ºC  a  ºF  "
                + "\n 2. ºF  a  ºC ");
        int n = sc.nextInt();
        if (n == 1) {
            JOptionPane.showInputDialog("Ingresa grados centigrados:");
            int c = sc.nextInt();
            double f = (c * 9 / 5) + (32);
            JOptionPane.showMessageDialog(null, "el resultado es:" + f);
        } else {
            JOptionPane.showInputDialog("Ingresa grados fahrenheit: ");
            int f = sc.nextInt();
            double c = (f - 32) * 5 / 9;
            JOptionPane.showMessageDialog(null, "el resultado es:" + c);
        }
    }

    public void numeroRepetido() {
        String a, b, c;
        int n1, n2, n3, con = 1, suma;
        while (con == 1) {
            a = JOptionPane.showInputDialog("digite #1");
            b = JOptionPane.showInputDialog("digite #2");
            c = JOptionPane.showInputDialog("digite #3");
            n1 = Integer.parseInt(a);
            n2 = Integer.parseInt(b);
            n3 = Integer.parseInt(c);
            if (n1 == n2 || n2 == n3 || n3 == n1) {
                JOptionPane.showMessageDialog(null, "Hay un numero repetido no se puede hallar el del centro", "", JOptionPane.ERROR_MESSAGE);
            } else {
                if (n1 > n2 && n1 < n3 || n1 < n2 && n1 > n3) {
                    JOptionPane.showMessageDialog(null, "el numero del centro es" + n1, "", JOptionPane.PLAIN_MESSAGE);
                } else if (n2 > n1 && n2 < n3 || n2 < n1 && n2 > n3) {
                    JOptionPane.showMessageDialog(null, "el numero del centro es" + n2, "", JOptionPane.PLAIN_MESSAGE);
                } else if (n3 > n2 && n3 < n1 || n3 < n2 && n3 > n1) {
                    JOptionPane.showMessageDialog(null, "el numero del centro es" + n3, "", JOptionPane.PLAIN_MESSAGE);
                }
            }
            suma = n1 + n2 + n3;
            if (suma == 15) {
                con = 2;
            }
        }
    }

    /*Desarrollar una solucion que permita ingresar el radio y la altura
        de un cilindro.calcular y mostrar el volumen de un cilindro.Considere:
        v=[3.14.16*(radio**2)*altura.
     */
    public void calculoVolumen() {
        int radio, altura;
        double volumen;
        radio = 0;
        altura = 0;
        volumen = 0;
        double pi = 3.1416;
        Scanner dato = new Scanner(System.in);
        System.out.print("radio = ");
        radio = dato.nextInt();
        System.out.print("Altura = ");
        altura = dato.nextInt();
        volumen = (pi * (radio * radio) * altura);
        System.out.println("El Volumen del Cilindro es : " + volumen + " U Cubicas");
    }

    /*4.- Desarrollar una solucion que permita convertir una cantidad expresadas
       en metros a sus equivalentes en centimentros, pulgadas, pies y yardas.
     */
    public void conversionMetros() {
        int M;
        int CM;
        int Y;
        int op;
        double RES;
        JOptionPane.showInputDialog("Ingrese longitud en metros \n 1.metros a centimetros"
                + "\n2.-metros a yardas" + "\n 3.- metros a pies");
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la operacion");
        System.out.println("1.- Centimetos a pulgadas");
        System.out.println("2.- Yardas a metros");
        System.out.println("\n");
        op = leer.nextInt();

        switch (op) {
            case 1:
                System.out.println("Centimetros a pulgadas");
                System.out.println("Ingrese los centimetros");
                CM = leer.nextInt();
                RES = CM * 2.3;
                System.out.println("El resultado es: " + RES + " pulgadas");
                break;
            case 2:
                System.out.println("Yardas a Metros");
                System.out.println("Ingrese el numero de Yardas");
                Y = leer.nextInt();
                RES = Y * 0.914401829;
                System.out.println("El resultado es: " + RES + " metros");
                break;

        }

    }

    /*5.-Desarrollar una solucion que permita ingresar la base menor, 
    la base mayor
    y la altura de un trapecio. Calcular y mostrar su area.
     */
    public void areaTrapecio() {
        Scanner entrada = new Scanner(System.in);
        int baseMenor = 0;
        int baseMayor = 0;
        int altura = 0;
        System.out.println("Ingresar valor de base menor: ");
        baseMenor = entrada.nextInt();
        System.out.println("Ingresar valor de base mayor: ");
        baseMayor = entrada.nextInt();
        System.out.println("Ingresar valor de la altura: ");
        altura = entrada.nextInt();
        System.out.println("El area del trapecio es:" + (altura * ((baseMenor + baseMayor) / 2)));
    }
}
    


