/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.principal;

/**
 *
 * @author jorgepc
 */

//Ideia: Criar um loop que vai chamar o método de seleção switch case e criar os ingressos um a um

public class Principal {

    public static void main(String[] args) 
    {
        IngressoCamarote ingresso = new IngressoCamarote();
        
        ingresso.setNome("Show de reggae");
        ingresso.setData("12/08/2022");
        ingresso.setValorUnico(100.00f);
        ingresso.setCapacidadeMaxima(1000);
        
        ingresso.calcularValor();
        ingresso.imprimirValor();
        
        System.out.println("\n\n");
        
        ingresso.imprimirInformacoes();
        
        
    }
}
