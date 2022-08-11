/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

 //

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
        System.out.println("#---------------------------------------------------------#");
        System.out.println("#--------INÍCIO DO PROGRAMA DE VENDAS DE INGRESSO---------#");
        System.out.println("#---------------------------------------------------------#");
        System.out.println("\n\n");
        System.out.println("#---------Inicio evento: Show de Seu Jorge-----------#\n");
        
        // ###### INSERÇÕES PARA O SHOW DE SEU JORGE ######
        // Criando evento Show de Seu Jorge 
        Evento showDeSeuJorge = new Evento("Show de Seu Jorge", "12/08/2022", 100.0f, 1000);
        
        
        // Criando primeiro ingresso
        IngressoCamarote ingresso1 = new IngressoCamarote("Jorge da Silva", "98745632112", showDeSeuJorge);
        ingresso1.mostrarResumo();
        ingresso1.imprimirValor();
        System.out.println("\n");

        // Criando segundo ingresso
        
        IngressoVip ingresso2 = new IngressoVip("João dos Santos", "45879632115", showDeSeuJorge);
        ingresso2.mostrarResumo();
        ingresso2.imprimirValor();
        System.out.println("\n");
        
        // Criando terceiro ingresso
        
        IngressoPista ingresso3 = new IngressoPista("Marina Silva", "88877799952", showDeSeuJorge);
        ingresso3.mostrarResumo();
        ingresso3.imprimirValor();
        System.out.println("\n");
        
        // Criando quarto ingresso
        IngressoPista ingresso4 = new IngressoPista("Felipe Carneiro", "55598735652", showDeSeuJorge);
        ingresso4.mostrarResumo();
        ingresso4.imprimirValor();
        System.out.println("\n");
        
        // Criando quinto ingresso 
        IngressoPista ingresso5 = new IngressoPista("Marcus Leonardo", "12345699866", showDeSeuJorge);
        ingresso5.mostrarResumo();
        ingresso5.imprimirValor();
        System.out.println("\n");
        

        // Adicionando os ingressos ao evento e exibindo quantidade vendida. 
        showDeSeuJorge.venderIngresso(ingresso1);
        showDeSeuJorge.venderIngresso(ingresso2);
        showDeSeuJorge.venderIngresso(ingresso3);
        showDeSeuJorge.venderIngresso(ingresso4);
        showDeSeuJorge.venderIngresso(ingresso5);
        
        showDeSeuJorge.mostrarIngressosVendidos();
        
        System.out.println("\n#---------Fim evento: Show de Seu Jorge-----------#\n");
        //######################################################################
        
        
        System.out.println("\n\n#---------Inicio evento: Show de Stand Up-----------#\n");
        // ###### INSERÇÕES PARA O SHOW DE SEU JORGE ######
        // Criando evento Show de Seu Jorge 
        Evento showDeStandUp = new Evento("Show de Stand up", "30/08/2022", 150.0f, 200);
        
        
        // Criando primeiro ingresso
        IngressoCamarote ingresso6 = new IngressoCamarote("Saulo Fernandes", "15987562112", showDeStandUp);
        ingresso6.mostrarResumo();
        ingresso6.imprimirValor();
        System.out.println("\n");

        // Criando segundo ingresso
        
        IngressoVip ingresso7 = new IngressoVip("Jovelino Martins", "89562347115", showDeStandUp);
        ingresso7.mostrarResumo();
        ingresso7.imprimirValor();
        System.out.println("\n");
        
        // Criando terceiro ingresso
        
        IngressoPista ingresso8 = new IngressoPista("Indiaroba", "84961532987", showDeStandUp);
        ingresso8.mostrarResumo();
        ingresso8.imprimirValor();
        System.out.println("\n");
        

        // Adicionando os ingressos ao evento e exibindo quantidade vendida. 
        showDeStandUp.venderIngresso(ingresso6);
        showDeStandUp.venderIngresso(ingresso7);
        showDeStandUp.venderIngresso(ingresso8);
        
        showDeStandUp.mostrarIngressosVendidos();
        
        System.out.println("\n#---------Fim evento: Show de Stand Up-----------#\n");
        
        
        System.out.println("\n#---------------------------------------------------------#");
        System.out.println("#---------FIM DO PROGRAMA DE VENDAS DE INGRESSO-----------#");
        System.out.println("#---------------------------------------------------------#");
        System.out.println("\n\n");
    }
}
