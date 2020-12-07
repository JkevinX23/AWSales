/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package awsales3.App.Controller.SwingWorkers;

import awsales3.App.Models.Cliente;
import awsales3.SQLs;
import awsales3.Services.Database;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingWorker;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jkevi
 */
public class AsyncLoadClient extends SwingWorker<Boolean, Object> {

    JTable table = new JTable();

    public AsyncLoadClient(JTable table) {
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
                String sql = sqls.getClient();
                try {
                    stmt = con.createStatement();
                    ResultSet rs = stmt.executeQuery(sql);
                    while (rs.next()) {
                        String codigo = rs.getString("codigo");
                        String tratamento = rs.getString("tratamento");
                        String primeironome = rs.getString("primeironome") + " ";
                        String nomedomeio = rs.getString("nomedomeio") + " ";
                        String sobrenome = rs.getString("sobrenome");
                        String sufixo = rs.getString("sufixo");
                        String senha = rs.getString("senha");
                        Cliente cliente = new Cliente();
                        cliente.setCodigo(codigo);
                        cliente.setTratamento(tratamento);
                        cliente.setPrimeironome(primeironome);
                        cliente.setNomedomeio(nomedomeio);
                        cliente.setSobrenome(sobrenome);
                        cliente.setSufixo(sufixo);
                        cliente.setSenha(senha);

                        manipularTabela.addRow(new Object[]{
                            cliente.getCodigo(),
                            cliente.getPrimeironome(),
                            cliente.getNomedomeio(),
                            cliente.getSobrenome(),
                            cliente.getSufixo(),
                            cliente.getTratamento(),
                            cliente.getSenha(),});
                    }
                    rs.close();
                    stmt.close();
                    con.close();
                } catch (SQLException e) {
                    System.out.println(e);
                }
                return true;
            }
        } catch (Exception e) {
            System.out.println("E -> " + e);
        }
        return false;
    }

    @Override
    protected void done() {
        super.done();
        try {
            Boolean response = get();
            if (response) {
                JOptionPane.showMessageDialog(null, "Todos os usuarios foram carregados");
                return;
            }
            JOptionPane.showMessageDialog(null, "Erro ao carregar os usuarios");
        } catch (InterruptedException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar os usuarios");
            Logger.getLogger(AsyncLoadClient.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ExecutionException ex) {
            Logger.getLogger(AsyncLoadClient.class.getName()).log(Level.SEVERE, null, ex);
            
        }

    }
}
