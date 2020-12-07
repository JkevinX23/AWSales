/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package awsales3.App.Controller.SwingWorkers;

import awsales3.App.Models.Cliente;
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
public class AsyncCreateUser extends SwingWorker <Boolean, Void>{
    Cliente client = new Cliente();
    
    public AsyncCreateUser(Cliente client){
        this.client = client;
    }

    @Override
    protected Boolean doInBackground() throws Exception {
        
        Auxiliar aux = new Auxiliar();
        SQLs sqls = new SQLs();
        Database db = new Database();
        java.sql.Connection con = db.getConnection();
        Statement stmt = null;
        
        try {

            String primeironome = client.getPrimeironome();
            String nomedomeio = client.getNomedomeio();
            String sobrenome = client.getSobrenome();
            String sufixo = client.getSufixo();
            String senha = client.getSenha();
            String tratamento = client.getTratamento();
            String codigo = aux.getCodigo();

            String sql
                    = sqls.getInsertCliente()+ "(" 
                    + codigo + ",'" + tratamento+ "','"
                    + primeironome + "','" + nomedomeio + "','" + sobrenome
                    + "','" + sufixo + "','" + senha + "')";
            
            
            if (con != null) {
                System.out.println("CONECTADO");
                System.out.println("SQL-> " + sql);
                stmt = con.createStatement();
                System.out.println("Estado obtido");
                stmt.executeQuery(sql);
                System.out.println("Query executada");
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
        return false;
    }

    @Override
    protected void done() {
        super.done();
        Boolean option;
        try {
            option = get();
              if(option){
              JOptionPane.showMessageDialog(null, "Usuário adicionado com sucesso!");
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

