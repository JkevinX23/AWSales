/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package awsales3.App.Models;

import java.security.Timestamp;

public class Produto {
    private String codigo;
    private String nome;
    private String cor;
    private String tamanho;

    private float custoproducao;
    private float preco;
    private float peso;
    
    private int codigocategoria;
    private int codigomodelo;
    
    private Timestamp dtiniciovenda;
    private Timestamp dtfimvenda;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public float getCustoproducao() {
        return custoproducao;
    }

    public void setCustoproducao(float custoproducao) {
        this.custoproducao = custoproducao;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getCodigocategoria() {
        return codigocategoria;
    }

    public void setCodigocategoria(int codigocategoria) {
        this.codigocategoria = codigocategoria;
    }

    public int getCodigomodelo() {
        return codigomodelo;
    }

    public void setCodigomodelo(int codigomodelo) {
        this.codigomodelo = codigomodelo;
    }

    public Timestamp getDtiniciovenda() {
        return dtiniciovenda;
    }

    public void setDtiniciovenda(Timestamp dtiniciovenda) {
        this.dtiniciovenda = dtiniciovenda;
    }

    public Timestamp getDtfimvenda() {
        return dtfimvenda;
    }

    public void setDtfimvenda(Timestamp dtfimvenda) {
        this.dtfimvenda = dtfimvenda;
    }


}
