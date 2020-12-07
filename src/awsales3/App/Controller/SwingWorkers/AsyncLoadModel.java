package awsales3.App.Controller.SwingWorkers;

import awsales3.SQLs;
import awsales3.Services.Database;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.SwingWorker;

public class AsyncLoadModel extends SwingWorker<Void, Object>  {
    
     JComboBox jcb = new JComboBox();

    public AsyncLoadModel(JComboBox jcb) {
         this.jcb = jcb;
    }

    @Override
    protected Void doInBackground() throws Exception {
         SQLs sqls = new SQLs();
        Database db = new Database();
        java.sql.Connection con = db.getConnection();
        Statement stmt = null;

         try {
              String sql = sqls.getSelectModelo();
              if (con != null) {
               System.out.println("CONECTADO");
               System.out.println("Listando Modelos");
               stmt = con.createStatement();
               stmt.executeQuery(sql);
               ResultSet rs = stmt.executeQuery(sql);
                while (rs.next()) {
                    jcb.addItem(new ComboItem(rs.getString("nome"), rs.getString("codigo")));
                }
              }
         }catch(SQLException exception){
             System.out.println("EX -> " + exception);
         }
        return null;
    }
    
    
    class ComboItem
{
    private String key;
    private String value;

    public ComboItem(String key, String value)
    {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString()
    {
        return key;
    }

    public String getKey()
    {
        return key;
    }

    public String getValue()
    {
        return value;
    }
}
    
}
