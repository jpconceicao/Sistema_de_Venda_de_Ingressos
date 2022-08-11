/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principal;

/**
 *
 * @author jorgi
 */
public class IngressoVip extends Ingresso {
    
    protected String tipo = "Vip";
     //Construtor da classe
    public IngressoVip(String nomePessoa, String cpf, Evento eventoRelacionado)
    {
        Evento evento = eventoRelacionado;
        this.setNomeEvento(evento.getNomeEvento());
        this.setDataEvento(evento.getDataEvento());
        this.setValorUnico(evento.getValorUnico());
        this.setCapacidadeMaxima(evento.getCapacidadeMaxima());
        this.setNomePessoa(nomePessoa);
        this.setCpf(cpf);
        
        calcularValor();
    }

    @Override
    public void calcularValor()
    {
        float valorUnicoEvento = getValorUnico();
        this.valor = valorUnicoEvento * 1.3f;
    }
    
    public void imprimirValor()
    {
        System.out.println("Tipo do Ingresso: " + this.tipo);
        System.out.println("O valor do ingresso é:  " + this.valor);
    }
}
