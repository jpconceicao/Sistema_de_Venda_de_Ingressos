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
    private String nome;
    private String data;
    private float valorUnico;
    private int capacidadeMaxima;
    private ArrayList<String> ingressos = new ArrayList<String>();

    public void setNomeEvento(String nome)
    {
        this.nome = nome;
    }

    public String getNomeEvento()
    {
        return this.nome;
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

    public float getCapacidadeMaxima()
    {
        return this.capacidadeMaxima;
    }

    public void venderIngresso(String ingresso) //O objeto passado será um objeto da class ingresso.
    {
        System.out.println("Metodo vender ingresso!");
        ingressos.add(ingresso);
    }

    public void mostrarIngressosVendidos()
    {
        System.out.println("Mostrar ingressos vendidos!");
        /*
        for (int i = 0; i < String.length(); i++)
        {
            System.out.println(ingressos[1]);
        }
        */
    }
    
    public void imprimirInformacoesEvento()
    {
        System.out.println("Nome do evento: " + this.nome);
        System.out.println("Data do evento: " + this.data);
        System.out.println("Valor único: " + this.valorUnico);
        System.out.println("Capacidade máxima de pessoas: " + this.capacidadeMaxima);
    }
}
