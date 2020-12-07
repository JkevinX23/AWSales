
package awsales3.App.Controller;

import awsales3.Services.Database;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class LoginController {
    public boolean validarVendedor(String user, String password ) {
        Database db = new Database();
        java.sql.Connection con = db.getConnection();
        Statement stmt = null;


        try {
            if (con != null) {
                String sql =  "SELECT * FROM vendedor where codigo='" + user + "'and senha='" + password+"'";
                stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery(sql);
                if(rs!= null){
                    rs.close();
                    stmt.close();
                    con.close();
                    return true;
                 }}
        }catch(SQLException e){
            System.out.println("E-> " + e);
            return false;
        }
        return false;
    }
        
        
//        if(user.equals("geral") && password.equals("123")){
//        return true;
//        }
//        return false;
//    }
}
