/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package awsales3.App.Controller.SwingWorkers;

import awsales3.App.Models.Pedido;
import awsales3.App.Models.Transportadora;
import awsales3.SQLs;
import awsales3.Services.Database;
import awsales3.Util.Auxiliar;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingWorker;

public class AsyncCreatePedido  extends SwingWorker <Boolean, Void> {
    Pedido pedido;
    
    public AsyncCreatePedido(Pedido pedido){
      this.pedido = pedido;
    }
    
    @Override
    protected Boolean doInBackground() throws Exception {
          Auxiliar aux = new Auxiliar();
          SQLs sqls = new SQLs();
          Database db = new Database();
          java.sql.Connection con = db.getConnection();
          Statement stmt = null;
    
        try {
            String codigoconfirmacao = pedido.getCodigoconfirmacao();
            String contacliente = pedido.getContacliente();
            Integer codigo = Integer.valueOf(aux.getCodigo());
            Integer codigocliente = pedido.getCodigocliente();
            Integer codigotransportadora = pedido.getCodigotransportadora();
            Integer codigovendedor = pedido.getCodigovendedor();
            Integer enderecoentrega = pedido.getEnderecoentrega();
            Integer imposto = pedido.getImposto();
            
            String sql
                    = sqls.getInsertPedido()+ "(" 
                    + codigo + "," + null + ","
                    + null + "," + null +"," + codigocliente + ",'" 
                    + contacliente + "',"+ null+",'"+codigoconfirmacao+"',"
                    + codigovendedor + "," + imposto + "," + null 
                    + "," + enderecoentrega + "," + codigotransportadora + "')";
            
            if (con != null) {
                stmt = con.createStatement();
                stmt.executeQuery(sql);
                stmt.close();
                con.close();
                System.out.println("SUCESSO");
                return true;
            }
        } catch (SQLException e) {
            System.out.println("Erro");
            System.out.println(e);
             return false;
        }
        return null;

    }
 @Override
    protected void done() {
        super.done();
        Boolean option;
        try {
            option = get();
              if(option){
              JOptionPane.showMessageDialog(null, "Pedido registrado com sucesso!");
              return;
            }
              JOptionPane.showMessageDialog(null, "Erro! Tente novamente");
        } catch (InterruptedException ex) {
            Logger.getLogger(AsyncCreateUser.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro! Tente novamente");
        } catch (ExecutionException ex) {
            Logger.getLogger(AsyncCreateUser.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro! Tente novamente");
        }
      
      
    }
    
}


    
    
  

   
