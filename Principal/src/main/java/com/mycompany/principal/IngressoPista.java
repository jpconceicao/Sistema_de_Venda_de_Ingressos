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
    
    //Construtor da classe
    public IngressoPista(String nomeEvento, String data, float valorUnico, int capacidadeMaxima, String nomePessoa, String cpf)
    {
        this.setNomeEvento(nomeEvento);
        this.setDataEvento(data);
        this.setValorUnico(valorUnico);
        this.setCapacidadeMaxima(capacidadeMaxima);
        this.setNomePessoa(nomePessoa);
        this.setCpf(cpf);
    }

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
