/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principal;

import java.util.ArrayList;
/**
 *
 * @author jorgepc
 */

public class Evento {
    private String nomeEvento;
    private String data;
    private float valorUnico;
    private int capacidadeMaxima;
    private ArrayList<Ingresso> ingressos = new ArrayList<Ingresso>();
    
    public Evento(){}
    
    public Evento(String nome, String data, float valor, int capacidade)
    {
        this.nomeEvento = nome;
        this.data = data;
        this.valorUnico = valor;
        this.capacidadeMaxima = capacidade;
    }
    
    public void setNomeEvento(String nome)
    {
        this.nomeEvento = nome;
    }

    public String getNomeEvento()
    {
        return this.nomeEvento;
    }

    public void setDataEvento(String data)
    {
        this.data = data;
    }

    public String getDataEvento()
    {
        return this.data;
    }

    public void setValorUnico(float valorUnico)
    {
        this.valorUnico = valorUnico;
    }

    public float getValorUnico()
    {
        return this.valorUnico;
    }

    public void setCapacidadeMaxima(int capacidadeMaxima)
    {
        this.capacidadeMaxima = capacidadeMaxima;
    }

    public int getCapacidadeMaxima()
    {
        return this.capacidadeMaxima;
    }

    public void venderIngresso(Ingresso ingresso) //O objeto passado será um objeto da class ingresso.
    {
        if(ingressos.size() < this.capacidadeMaxima)
        {
            ingressos.add(ingresso);
        }
        else
        {
            System.out.println("Quantidade de ingressos vendidos chegou ao limite!");
        }
        
    }

    public void mostrarIngressosVendidos()
    {
        System.out.println("Quantidade de ingressos vendidos para o " + this.nomeEvento + " é: " + ingressos.size());
        
    }
    
    public void imprimirInformacoesEvento()
    {
        System.out.println("Nome do evento: " + this.nomeEvento);
        System.out.println("Data do evento: " + this.data);
        System.out.println("Valor único: " + this.valorUnico);
        System.out.println("Capacidade máxima de pessoas: " + this.capacidadeMaxima);
    }
    
}
