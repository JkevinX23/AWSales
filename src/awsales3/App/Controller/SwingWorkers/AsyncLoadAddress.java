/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package awsales3.App.Controller.SwingWorkers;

import awsales3.SQLs;
import awsales3.Services.Database;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JTable;
import javax.swing.SwingWorker;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jkevi
 */
public class AsyncLoadAddress extends SwingWorker <Void, Void>{
       JTable table = new JTable();

    public AsyncLoadAddress(JTable table) {
        this.table = table;
    }

    @Override
    protected Void doInBackground() throws Exception {
        DefaultTableModel manipularTabela = (DefaultTableModel) table.getModel();
        manipularTabela.setNumRows(0);
        SQLs sqls = new SQLs();
        Database db = new Database();
        java.sql.Connection con = db.getConnection();
        Statement stmt = null;

        try {
            if (con != null) {
                String sql = sqls.getSelectAddress();
                stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery(sql);
                 while (rs.next()) {
                      String codigo = rs.getString("id");
                      String logradouro = rs.getString("logradouro");
                      String complemento = rs.getString("complemento");
                      String cidade = rs.getString("cidade");
                      String estado = rs.getString("estado");
                      String pais = rs.getString("pais");
                      String codigopostal = rs.getString("codigopostal");
                      
                          manipularTabela.addRow(new Object[]{
                            codigo,
                            logradouro,
                            complemento,
                            cidade,
                            estado,
                            pais,
                            codigopostal,
                          });
                    }
                    rs.close();
                    stmt.close();
                    con.close();
                 }
        }catch(SQLException e){
            System.out.println("E-> " + e);
           
        }
           return null;
    }
}