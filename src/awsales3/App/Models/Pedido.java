package awsales3.App.Models;


public class Pedido {
    private Integer codigo;
    private String contacliente;
    private Integer codigocliente;
    private Integer numerocartao;
    private String codigoconfirmacao;
    private Integer codigovendedor;
    private Integer imposto;
    private Integer enderecofatura;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getContacliente() {
        return contacliente;
    }

    public void setContacliente(String contacliente) {
        this.contacliente = contacliente;
    }

    public Integer getCodigocliente() {
        return codigocliente;
    }

    public void setCodigocliente(Integer codigocliente) {
        this.codigocliente = codigocliente;
    }

    public Integer getNumerocartao() {
        return numerocartao;
    }

    public void setNumerocartao(Integer numerocartao) {
        this.numerocartao = numerocartao;
    }

    public String getCodigoconfirmacao() {
        return codigoconfirmacao;
    }

    public void setCodigoconfirmacao(String codigoconfirmacao) {
        this.codigoconfirmacao = codigoconfirmacao;
    }

    public Integer getCodigovendedor() {
        return codigovendedor;
    }

    public void setCodigovendedor(Integer codigovendedor) {
        this.codigovendedor = codigovendedor;
    }

    public Integer getImposto() {
        return imposto;
    }

    public void setImposto(Integer imposto) {
        this.imposto = imposto;
    }

    public Integer getEnderecofatura() {
        return enderecofatura;
    }

    public void setEnderecofatura(Integer enderecofatura) {
        this.enderecofatura = enderecofatura;
    }

    public Integer getEnderecoentrega() {
        return enderecoentrega;
    }

    public void setEnderecoentrega(Integer enderecoentrega) {
        this.enderecoentrega = enderecoentrega;
    }

    public Integer getCodigotransportadora() {
        return codigotransportadora;
    }

    public void setCodigotransportadora(Integer codigotransportadora) {
        this.codigotransportadora = codigotransportadora;
    }
    private Integer enderecoentrega;
    private Integer codigotransportadora;

  
}