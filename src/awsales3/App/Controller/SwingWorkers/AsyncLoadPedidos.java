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
public class AsyncLoadPedidos  extends SwingWorker<Boolean, Object> {
      JTable table = new JTable();

    public AsyncLoadPedidos(JTable table) {
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
                String sql = sqls.getSelectPedidos();
                stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery(sql);
                 while (rs.next()) {
                     
                      Integer codigo = rs.getInt("codigo");
                      Integer codigocliente = rs.getInt("codigocliente");
                      String contacliente = rs.getString("contacliente");
                      Integer numerocartao = rs.getInt("numerocataocredito");
                      String codigoconfirmacao = rs.getString("codigoconfirmacao");
                      Integer codigovendedor = rs.getInt("codigovendedor");
                      Integer imposto = rs.getInt("imposto");
                      Integer enderecofatura = rs.getInt("enderecofatura");
                      Integer enderecoentrega = rs.getInt("enderecoentrega");
                      Integer codigotransportadora = rs.getInt("codigotransportadora");
                      
                      manipularTabela.addRow(new Object[]{
                      codigo,
                      codigocliente,
                      contacliente,
                      numerocartao,
                      codigoconfirmacao,
                      codigovendedor,
                      imposto,
                      enderecofatura,
                      enderecoentrega,
                      codigotransportadora
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
