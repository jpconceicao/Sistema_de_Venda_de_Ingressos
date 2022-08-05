/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principal;

/**
 *
 * @author jorgepc
 */
public class Ingresso extends Evento {
    
    protected float valor;
    
    protected String nomePessoa;
    protected String cpf;
    
    public void calcularValor(){};

    public void setNomePessoa(String nomePessoa)
    {
        this.nomePessoa = nomePessoa;
    }

    public String getNomePessoa()
    {
        return this.nomePessoa;
    }
    
    public void setCpf(String cpf)
    {
        this.cpf = cpf;
    }

    public String getCpf()
    {
        return this.cpf;
    }
    
    //Apresenta resumo do ingresso
    public void mostrarResumo()
    {
        System.out.println("Nome do Evento: " + this.getNomeEvento());
        System.out.println("Data do Evento: " + this.getDataEvento());
        System.out.println("Nome da Pessoa: " + this.nomePessoa);
        System.out.println("CPF da Pessoa: " + this.cpf);
    }
}
