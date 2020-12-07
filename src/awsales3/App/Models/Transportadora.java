/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package awsales3.App.Models;

/**
 *
 * @author jkevi
 */
public class Transportadora {
    private String codigo;
    private String nome;
    private Float taxaBase;

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

    public Float getTaxaBase() {
        return taxaBase;
    }

    public void setTaxaBase(Float taxaBase) {
        this.taxaBase = taxaBase;
    }

    public Float getTaxaEnvio() {
        return taxaEnvio;
    }

    public void setTaxaEnvio(Float taxaEnvio) {
        this.taxaEnvio = taxaEnvio;
    }
    private Float taxaEnvio;
    
}
