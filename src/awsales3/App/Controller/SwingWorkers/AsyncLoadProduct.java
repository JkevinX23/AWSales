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
public class AsyncLoadProduct extends SwingWorker<Boolean, Object> {

    JTable table = new JTable();

    public AsyncLoadProduct(JTable table) {
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
                String sql = sqls.getSelectProduct();
                stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery(sql);
                 while (rs.next()) {
                      String codigo = rs.getString("codigo");
                      String nome = rs.getString("nome");
                      String cor = rs.getString("cor");
                      String tamanho = rs.getString("tamanho");
                      String custoproducao = rs.getString("custoproducao");
                      String preco = rs.getString("preco");
                      String codigocategoria = rs.getString("codigocategoria");
                      String codModelo = rs.getString("codigomodelo");
                      
                          manipularTabela.addRow(new Object[]{
                            codigo,
                            nome,
                            cor,
                            tamanho,
                            custoproducao,
                            preco,
                            codigocategoria,
                            codModelo
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
