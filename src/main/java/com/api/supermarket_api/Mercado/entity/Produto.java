package com.api.supermarket_api.Mercado.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
//Entidade Produtos
@Entity
@Table(name = "produto")
public class Produto {
    //Declaração da chave primaria
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; 

    //Declaração da coluna codicoProduto
    @Column(name = "codicoProduto")
    private int codicoProduto;

    //Declaração da coluna descricao
    @Column(name = "descricao")
    private String descricao;

    //Declaração da coluna valorUnitario
    @Column(name = "valorUnitario")
    private Double valorUnitario;

    //getter and setters
    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }

    public int getCodicoProduto(){
        return codicoProduto;
    }
    public void setCodicoProduto(int codicoProduto){
        this.codicoProduto = codicoProduto;
    }

    public String getDescricao(){
        return descricao;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public Double getValorUnitario(){
        return valorUnitario;
    }
    public void setValorUnitario(Double valorUnitario){
        this.valorUnitario = valorUnitario;
    }
    
}