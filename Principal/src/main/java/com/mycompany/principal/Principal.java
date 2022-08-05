/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.principal;
import java.util.ArrayList; // import the ArrayList class

/**
 *
 * @author jorgepc
 */

//Ideia: Criar um loop que vai chamar o método de seleção switch case e criar os ingressos um a um

public class Principal {

    public static void main(String[] args) 
    {
        // Criando primeiro ingresso
        IngressoCamarote ingresso1 = new IngressoCamarote("Show de Seu Jorge", "12/08/2022", 100.00f, 1000, "Jorge da Silva", "98745632112");
        ingresso1.calcularValor();
        
        ingresso1.imprimirValor();
        ingresso1.mostrarResumo();

        System.out.println("\n\n");

        // Criando segundo ingresso
        
        IngressoVip ingresso2 = new IngressoVip("Show de Seu Jorge", "12/08/2022", 100.00f, 1000, "João dos Santos", "45879632115");
        ingresso2.calcularValor();
        
        ingresso2.imprimirValor();
        ingresso2.mostrarResumo();

        System.out.println("\n\n");
        
        // Criando terceiro ingresso
        
        IngressoPista ingresso3 = new IngressoPista("Show de Seu Jorge", "12/08/2022", 100.00f, 1000, "Marina Silva", "88877799952");
        ingresso3.calcularValor();
        
        ingresso3.imprimirValor();
        ingresso3.mostrarResumo();
        
        System.out.println("\n\n");
      
        
        ArrayList<Ingresso> ingressos = new ArrayList<Ingresso>();
        ingressos.add(ingresso1);
        ingressos.add(ingresso2);
        ingressos.add(ingresso3);
        
        System.out.println(ingressos);
        
    }
}
