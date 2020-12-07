package awsales3.App.Controller.SwingWorkers;

import awsales3.App.Models.Endereco;
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

/**
 *
 * @author jkevi
 */
public class AsyncCreateAddress extends SwingWorker <Boolean, Void>{
    Endereco endereco = new Endereco();
    
    public AsyncCreateAddress(Endereco endereco){
        this.endereco = endereco;
    }
    
    @Override
    protected Boolean doInBackground() throws Exception {
          Auxiliar aux = new Auxiliar();
          SQLs sqls = new SQLs();
          Database db = new Database();
          java.sql.Connection con = db.getConnection();
          Statement stmt = null;
    
    try {
            String logradouro = endereco.getLogradouro();
            String complemento = endereco.getComplemento();
            String cidade = endereco.getCidade();
            String estado = endereco.getEstado();
            String pais = endereco.getPais();
            String codigopostal = endereco.getCodigoPostal();
            Integer id = Integer.valueOf( aux.getCodigo());
            String sql
                    = sqls.getInsertEndereco()+ "(" 
                    + id + ",'" + logradouro+ "','"
                    + complemento + "','" + cidade + "','" + estado
                    + "','" + pais + "','" + codigopostal + "')";
            
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
              JOptionPane.showMessageDialog(null, "Endereco registrado com sucesso!");
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


    
    
  

   