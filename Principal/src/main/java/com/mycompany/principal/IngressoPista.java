/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principal;

/**
 *
 * @author jorgi
 */
public class IngressoPista extends Ingresso {
    
    @Override
    public void calcularValor()
    {
        float valorUnicoEvento = getValorUnico();
        this.valor = valorUnicoEvento;
    }
    
    public void imprimirValor()
    {
        System.out.println("Tipo do Ingresso: PISTA");
        System.out.println("O valor do ingresso é: " + this.valor);
    }
}
