
package awsales3;


public class SQLs {
    private final String selectPedidos = "SELECT * FROM pedido";
    private final String selectClient = "SELECT * FROM cliente";
    private final String selectProduct = "SELECT * FROM produto";
    private final String insertCliente = "INSERT INTO cliente VALUES "; 
    private final String insertEndereco = "INSERT INTO endereco VALUES "; 
    private final String selectAddress = "SELECT * FROM endereco";
    private final String selectCategoria = "SELECT * FROM categoria";
    private final String selectModelo = "SELECT * FROM modelo";
    private final String insertTransportadora = "INSERT INTO transportadora VALUES ";
    private final String insertPedido = "INSERT INTO pedido VALUES ";
    private final String selectTransportadora = "SELECT * FROM transportadora";

    public String getSelectTransportadora() {
        return selectTransportadora;
    }

    public String getInsertPedido() {
        return insertPedido;
    }

    public String getInsertTransportadora() {
        return insertTransportadora;
    }

    public String getSelectAddress() {
        return selectAddress;
    }

    public String getInsertEndereco() {
        return insertEndereco;
    }


    public String getInsertCliente() {
        return insertCliente;
    }

    public String getSelectModelo() {
        return selectModelo;
    }

    public String getSelectCategoria() {
        return selectCategoria;
    }

    public String getSelectPedidos() {
        return selectPedidos;
    }

    public String getSelectClient() {
        return selectClient;
    }

    public String getSelectProduct() {
        return selectProduct;
    }
    
    public String getPedidos(){
        return selectPedidos;
    }
    public String getClient(){
        return selectClient;
    }
    
}