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
public class AsyncLoadTransportadora extends SwingWorker<Boolean, Void> {
  
    JTable table = new JTable();

    public AsyncLoadTransportadora(JTable table) {
        this.table = table;
    }

    @Override
    protected Boolean doInBackground() throws Exception {
        DefaultTableModel manipularTabela = (DefaultTableModel) table.getModel();
        manipularTabela.setNumRows(0);
        SQLs sqls = new SQLs();
        Database db = new Database();
        java.sql.Connection con = db.getConnection();
        Statement stmt = null;

        try {
            if (con != null) {
                String sql = sqls.getSelectTransportadora();
                stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery(sql);
                 while (rs.next()) {
                      Integer codigo = rs.getInt("codigo");
                      String nome = rs.getString("nome");
                      Integer taxaenvio  = rs.getInt("taxaenvio");
                      Integer taxabase = rs.getInt("taxabase");
                      
                    manipularTabela.addRow(new Object[]{
                      codigo,
                      nome,
                      taxaenvio,
                      taxabase
                    });
                    }
                    rs.close();
                    stmt.close();
                    con.close();
                 }
        }catch(SQLException e){
            System.out.println("E-> " + e);
            return false;
        }
        return true;
    }
}
