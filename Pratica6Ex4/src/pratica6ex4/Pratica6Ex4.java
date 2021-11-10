/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pratica6ex4;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Pratica6Ex4 {

    /*
    4.	Criar um programa que imprima a tabela de conversão de polegadas para centímetros. 
    O usuário deve informar a quantidade máxima de polegadas, sendo a mínima 1. Uma polegada = 2,54cm.
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        float polegada, cm = (float) 2.54, soma;
        System.out.println("Digité a quantidade MAXIMA de polegadas para ser convertidos para cm: ");
        polegada = entrada.nextFloat();
        if (polegada < 1) {
            System.out.println("Quantidade minima de polegadas é 1: ");
        }
        else {
            soma = polegada * cm;
            System.out.println("A coversão de " +polegada+ " polegadas para cm é: " +soma+ " cm.");
        }
    }
    
}
